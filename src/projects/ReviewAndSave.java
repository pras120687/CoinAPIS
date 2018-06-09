package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import resources.PayLoad;

public class ReviewAndSave {
  @Test
  public void PostRequestReviewProject() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
				"\"reviewFromUid\":\"34\","+
				"\"reviewtoUid\":\"7\","+
				"\"rating\":\"5\","+
				"\"reviewMsg\":\"Nicework\","+
				"\"projectId\":\"97\","+
				"\"profileId\":\"1\","+
				"\"reviewFromuname\":\"pras120687\","+
				"\"reviewtouname\":\"vinay\","+
				
			"}").
	  when().
	  post("/cl/api/v1/reviews/save/").
	  then().assertThat().statusCode(200).extract().response();
	  //String response = RestAssured.given().header("Content-Type","application/json").body(PayLoad.reviewAndSave()).post("/cl/api/v1/reviews/save/").asString();
	  //System.out.println(response);
	  
  }
	  
  }

