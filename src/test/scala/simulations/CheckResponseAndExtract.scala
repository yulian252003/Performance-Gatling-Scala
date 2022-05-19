package simulations
import scala.concurrent.duration.DurationInt
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
class CheckResponseAndExtract extends Simulation
{
  val httpConf = http.baseUrl(url = "https://gorest.co.in/")
    .header (name = "Authorization", value = "Bearer 8c63b4ca3e0b73a3f8170534c63c82893b322341d1c79bb92c0dc24ec7f7bc7e")

  val scn = scenario(scenarioName = "check correlation and extract data")

    //get all the users
    .exec(http(requestName = "Get all users")
      .get("public/v2/users")
      .check(jsonPath("$[0].id").saveAs("userId")))

    .exec(http(requestName = "Get specific user")
      .get("public/v2/users/${userId}")
      .check(jsonPath("$.id").is("3284"))
        .check(jsonPath("$.name").is("Himadri Gowda"))
          .check(jsonPath("$.email").is("gowda_himadri@huel.net")))

  setUp(scn.inject(atOnceUsers(users = 1))).protocols(httpConf)
}
