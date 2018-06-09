package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import resources.PayLoad;

public class PostAddFAQ {
  @Test
  public void postAddFAQ() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body(PayLoad.addFAQ()).
	  when().
	  post("/cl/api/v1/faqs/addFaq").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").body(PayLoad.addFAQ()).post("/cl/api/v1/faqs/addFaq").asString();
	  System.out.println(response);
	  
	  
  }
}
