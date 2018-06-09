package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllProjectsStatusDescription {
  @Test
  public void getRequestProjectStatusDescription() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  post("/cl/api/v1/projects/getAllProjectStatusDesc/").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").post("/cl/api/v1/projects/getAllProjectStatusDesc/").asString();
	  System.out.println(response);
	  
  }
}
