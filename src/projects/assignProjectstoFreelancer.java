package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class assignProjectstoFreelancer {
  @Test
  public void postAssignProjectstoFreelancer() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
	"\"projectId\":\"70\","+
	"\"projectAssignedTo\":\"7\","+
"}").
	  when().
	  post("/cl/api/v1/projects/assignFreelancerToProject/").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").post("/cl/api/v1/projects/getProjectsByClient/").asString();
	  System.out.println(response);
	  
  }
}
