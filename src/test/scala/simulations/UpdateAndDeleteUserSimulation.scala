package simulations

import scala.concurrent.duration.DurationInt
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class UpdateAndDeleteUserSimulation extends Simulation
{
  val httpConf = http.baseUrl(url = "https://reqres.in/")
    .header (name = "Accept", value = "application/json")
    .header (name = "content-type", value = "application/json")

  val scn = scenario(scenarioName = "update user Scenario")

    .exec(http(requestName = "update specific user")
      .post("api/users/2")
      .body(RawFileBody("./src/test/resources/bodies/UpdateUser.json")).asJson
      .check(status.in (200 to 201)))

    .pause(duration = 3)
    .exec(http(requestName = "delete user")
      .delete(url="api/users/2")
      .check(status.in (200 to 204)))

  setUp(scn.inject(atOnceUsers(users = 1))).protocols(httpConf)



}
