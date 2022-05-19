package simulations

import scala.concurrent.duration.DurationInt
import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class LoopRequest extends Simulation {
  val httpConf = http.baseUrl(url = "https://reqres.in/")
    .header(name = "Accept", value = "application/json")
    .header(name = "content-type", value = "application/json")

  def getAllUsersRequest()=
  {
    repeat(times = 2)
    {
      exec(http(requestName = "get all users request")
        .get("api/users?page=2")
        .check(status.is(200)))
    }
  }

  def getSingleUserRequest() =
  {
    repeat(times = 2)
    {
      exec(http(requestName = "get single user request")
        .get("api/users/2")
        .check(status.is(200)))
    }
  }

  def AddUser() =
  {
    repeat(times = 2)
    {
      exec(http(requestName = "Add a user request")
        .post("api/users")
        .body(RawFileBody("./src/test/resources/bodies/AddUser.json")).asJson
        .check(status.in(200 to 201)))
    }
  }

    val scn = scenario(scenarioName = "user request scenario")

      .exec(getAllUsersRequest())
      .pause(2)
      .exec(getSingleUserRequest())
      .pause(2)
      .exec(AddUser())

    setUp(scn.inject(atOnceUsers(users = 1))).protocols(httpConf)
}