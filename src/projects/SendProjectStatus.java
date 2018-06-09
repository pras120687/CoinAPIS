package projects;

import java.io.IOException;

import org.testng.annotations.Test;

import common.ReadProperties;
import io.restassured.RestAssured;
import resources.PayLoad;

public class SendProjectStatus {
  @Test
  public void postRequestGetProjectStatus() throws IOException {
	  String temp = PayLoad.sendProjectProgress();
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  body(temp).
	  when().
	  post("/cl/api/v1/projects/sendProjectProgress/").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").body(PayLoad.sendProjectProgress()).post("/cl/api/v1/projects/sendProjectProgress/").asString();
	  System.out.println(response);
	  
  }
}
