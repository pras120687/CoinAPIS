package projects;

import java.io.IOException;

import org.testng.annotations.Test;

import common.ReadProperties;
import io.restassured.RestAssured;

public class GetClientCount {
  @Test
  public void GetRequestClient() throws IOException {
	  
String userid = ReadProperties.getPropValue("Userid");
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/client/count/"+userid).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").get("/cl/api/v1/client/count/"+userid).asString();
	  System.out.println(response);
  }
}
