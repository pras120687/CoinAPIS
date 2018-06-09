package registration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UserActivation {
  @Test
  public void postRequestUserActivation() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
"\"uname\":\"User3\""+
"}").
	  
	  when().
	  post("/cl/api/v1/user/activation").
	  then().assertThat().statusCode(200);
  }
}
