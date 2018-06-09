package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllProjects {
  @Test
  public void getRequestAllProjects() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/projects/getAllProjects/").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").get("/cl/api/v1/projects/getAllProjects").asString();
	  System.out.println(response);
  }
}
