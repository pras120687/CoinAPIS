package projects;

import java.io.IOException;

import org.testng.annotations.Test;

import common.ReadProperties;
import io.restassured.RestAssured;
import resources.PayLoad;


public class PostDeleteFAQ {
	
	
	
  @Test
  
  public void postRequestDeleteFAQ() throws IOException {
	  String deletefaq = ReadProperties.getPropValue("DeleteFAQ");
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body(PayLoad.addFAQ()).
	  when().
	  post("/cl/api/v1/faqs/deleteFaq/"+deletefaq).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").body(PayLoad.addFAQ()).post("/cl/api/v1/faqs/deleteFaq/"+deletefaq).asString();
	  System.out.println(response);
	  
  }
}
