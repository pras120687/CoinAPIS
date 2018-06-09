package registration;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class UserForgotPassword {
  @Test
  public void postRequestUserActivation() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
"\"emailId\":\"prasanthktgr@gmail.com\""+
"}").
	  
	  when().
	  post("/cl/api/v1/user/forgotPassword").
	  then().assertThat().statusCode(200);
  }
}
