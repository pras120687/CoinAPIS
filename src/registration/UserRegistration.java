package registration;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.RestAssuredMatchers;

public class UserRegistration {
	
	
  @Test
  public void postRequestofUserRegistration() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  
	  body("{"+
	
	"\"profileId\":1,"+
	"\"name\":\"User4\","+
	"\"surName\":\"User4\","+
	"\"userLoginName\":\"User4\","+
	"\"emailId\":\"user4@yopmail.com\","+
	"\"password\":\"password\""+
"}").
	  when().
	  post("/cl/api/v1/user/register").
	  then().assertThat().statusCode(200);
	  
	  /*when().
	  post("/cl/api/v1/user/register ").
	  then().assertThat().statusCode(200).and().contentType(ContentType.JSON);*/
	  
	  
	  
	  
	  
  }
}
