package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import resources.PayLoad;

public class PostFundsTansfer {
  @Test
  public void postRequestFundsTransfer() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body(PayLoad.fundsTransfer()).
	  when().
	  post("/cl/api/v1/finance/fundTransferRequest").
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").body(PayLoad.fundsTransfer()).post("/cl/api/v1/finance/fundTransferRequest/").asString();
	  System.out.println(response);
  }
}
