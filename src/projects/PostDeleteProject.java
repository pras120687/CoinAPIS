package projects;

import java.io.IOException;

import org.testng.annotations.Test;

import common.ReadProperties;
import io.restassured.RestAssured;


public class PostDeleteProject {
  @Test
  public void postRequestDeleteProject() throws IOException {
	  
	  String projectid = ReadProperties.getPropValue("ProjectID");
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	 
	  when().
	  post("/cl/api/v1/projects/deleteProject/"+projectid).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").post("/cl/api/v1/projects/deleteProject/"+projectid).asString();
	  System.out.println(response);
  }
}
