package simulations

import scala.concurrent.duration.DurationInt
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class CheckPauseTimeAndResponse extends Simulation
{
  val httpConf = http.baseUrl(url = "https://reqres.in/")
    .header (name = "Accept", value = "application/json")
    .header (name = "content-type", value = "application/json")


  val scn = scenario(scenarioName = "user api calls")

    .exec(http(requestName = "List all users")
      .post("api/users?page=2")
      .check(status.is (201)))

      .pause(duration = 5)

    .exec(http(requestName = "Single user api")
      .get("api/users/2")
      .check(status.in (200 to 210)))

    .pause(1,10)

    .exec(http(requestName = "Single user not found api")
      .get("api/users/23")
      .check(status.not(400),status.not(500)))
      .pause(3000.milliseconds)

        setUp(scn.inject(atOnceUsers(users = 1))).protocols(httpConf)
}
