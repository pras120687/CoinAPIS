package projects;

import java.io.IOException;

import org.testng.annotations.Test;

import common.ReadProperties;
import io.restassured.RestAssured;

public class GetFreelancerByProjectID {
	
	//String projectID = ReadProperties.getPropValue("ProjectID");
  @Test
  public void getRequestforFreelancerByProjectID() throws IOException {

	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/userDetails/getFreeLancerByProjectId/"+ReadProperties.getPropValue("ProjectID")).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").get("/cl/api/v1/userDetails/getFreeLancerByProjectId/"+ReadProperties.getPropValue("ProjectID")).asString();
	  System.out.println(response);
  }
}
