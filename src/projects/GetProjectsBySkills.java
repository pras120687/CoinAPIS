package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProjectsBySkills {
  @Test
  public void getRequestProjectBySkills() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  body("{\"skills\":[1,11,23]}").
	  when().
	  post("/cl/api/v1/projects/getProjectsBySkills/").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").body("{\"skills\":[1,11,23]}").post("/cl/api/v1/projects/getProjectsBySkills/").asString();
	  System.out.println(response);
	  
	  
  }
}
