package simulations

import scala.concurrent.duration.DurationInt
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DataFeederCsv extends Simulation
{
  val httpConf = http.baseUrl(url = "https://gorest.co.in/")
    .header (name = "Authorization", value = "Bearer 8c63b4ca3e0b73a3f8170534c63c82893b322341d1c79bb92c0dc24ec7f7bc7e")

  val csvFeeder = csv(fileName="./src/test/resources/data/getUser.csv").circular

  def getAuser(): ChainBuilder=
    {
      repeat(times = 7)
      {
        feed(csvFeeder)
          .exec(http(requestName = "Get Single user request")
        .get("public/v2/users/${userid}")
          .check(jsonPath(path = "$.name").is(expected = "${name}"))
          .check(status.in(200,304)))
        .pause(2)
      }
    }

  val scn = scenario(scenarioName = "user request scenario").exec(getAuser())
  setUp(scn.inject(atOnceUsers(users = 1))).protocols(httpConf)
}
