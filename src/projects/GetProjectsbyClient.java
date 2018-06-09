package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProjectsbyClient {
  @Test
  public void getProjectsbyClient() {
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
	"\"projectAssignedTo\":\"34\","+
	"\"projectStatus\":\"1\","+
"}").
	  when().
	  post("/cl/api/v1/projects/getProjectsByClient/").
	  then().assertThat().statusCode(200);
	  
  }
}
