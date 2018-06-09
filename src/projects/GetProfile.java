package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetProfile {
	
	int profileid=1;
  @Test
  public void getRequestProfiles() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/profiles/getProfile/"+profileid).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").get("/cl/api/v1/profiles/getProfile/"+profileid).asString();
	  System.out.println(response);
  }
}
