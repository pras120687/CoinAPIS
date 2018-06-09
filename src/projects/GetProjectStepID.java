package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProjectStepID {
	
	int stepid = 5;
  @Test
  public void getRequestProjectStepIDS() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/projectStep/getProjectStep/"+stepid).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").get("/cl/api/v1/projectStep/getProjectStep/"+stepid).asString();
	  System.out.println(response);
  }
}
