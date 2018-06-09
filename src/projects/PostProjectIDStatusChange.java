package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostProjectIDStatusChange {
  @Test
  public void postRequestProjectStatusUpdate() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
				
				"\"projectId\":\"97\","+
				"\"status\":\"dispute\","+
				
			"}").
	  when().
	  post("/cl/api/v1/projects/statuschange/").
	  then().assertThat().statusCode(200).extract().response();
	  //String response = RestAssured.given().header("Content-Type","application/json").body(PayLoad.reviewAndSave()).post("/cl/api/v1/reviews/save/").asString();
  }
}
