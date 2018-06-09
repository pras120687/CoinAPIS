package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class GetProjectsbyFreelancer {
	
  @Test
  public void getProjectsByFreelancer() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  
	  body("{"+
	"\"projectCreatedBy\":\"34\","+
	"\"projectStatus\":\"1\","+
	
"}").
	  when().
	  post("/cl/api/v1/projects/getProjectsByUser/").
	  then().assertThat().statusCode(200).extract().response();
	  
  }
}
