package simulations

import scala.concurrent.duration.DurationInt
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import scala.language.postfixOps

class LoadSimulationBasic extends Simulation {
  val httpConf = http.proxy(Proxy("localhost",8888))
    .baseUrl(url = "https://gorest.co.in/")
    .header(name = "Authorization", value = "Bearer 8c63b4ca3e0b73a3f8170534c63c82893b322341d1c79bb92c0dc24ec7f7bc7e")

  val csvFeeder = csv(fileName="./src/test/resources/data/getUser.csv").circular

  def getuser(): ChainBuilder=
  {
    repeat(times = 1)
    {
      feed(csvFeeder)
        .exec(http(requestName = "Get Single user request")
          .get("public/v2/users/${userid}")
          .check(jsonPath(path = "$.name").is(expected = "${name}"))
          .check(status.in(200, 304)))
        .pause(2)
    }
  }

  val scn = scenario(scenarioName = "basic load simulation").exec(getuser())

  setUp(
    scn.inject(
      nothingFor(5),
    atOnceUsers(10),
    rampUsers(15) during(5 seconds)
  ).protocols(httpConf))
}