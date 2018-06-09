package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetUserDetailsByUserID {
	
	int projectid=70;
  @Test
  public void getRequestProjectsByID() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  //header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/projects/getProjectById/"+projectid).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().get("/cl/api/v1/projects/getProjectById/"+projectid).asString();
	  System.out.println(response);
  }
}
