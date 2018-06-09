package projects;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

// Not working api

public class getSubCategoryIDS {
	int categoryid=1;
	
  @Test
  public void getRequestSubCategories() {
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  RestAssured.given().
	  
	  header("Content-Type","application/json").
	  when().
	  get("/cl/api/v1/categories/getSubCategories/"+categoryid).
	  then().assertThat().statusCode(200).extract().response();
	  String response = RestAssured.given().header("Content-Type","application/json").get("/cl/api/v1/categories/getSubCategories/"+categoryid).asString();
	  System.out.println(response);
  }
}
