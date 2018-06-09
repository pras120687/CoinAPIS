package projects;

import org.testng.annotations.Test;
import static common.Common.*;

import java.text.ParseException;
import java.util.Date;

import io.restassured.RestAssured;

public class AddProject {
	
	
	
  @Test
  public void postRequestofAddProject() throws ParseException {
	  long date1 = getapochstamp();
	  String newdate = Long.toString(date1);
	 // Date date2 = getfutureapochstamp();
	  //String enddate = Long.toString(date2);
	  
	  RestAssured.baseURI = "http://13.127.90.210:8090";
	  //String temp = getapochstamp()
	  RestAssured.given().
	  header("Content-Type","application/json").
	  
	  body("{"+
	"\"categoryId\":\"2\","+
	"\"projectSubCategoryId\":\"1\","+
	"\"projectTitle\":\"Automation Project 7\","+
	"\"projectDescription\":\"Automation Description 7\","+
	"\"projectStatus\":\"1\","+
	"\"projectCreatedBy\":\"34\","+
	"\"projectMaxBid\":\"100\","+
	"\"projectMinBid\":\"100\","+
	
	"\"projectFinalBid\":\"1000\","+
	"\"userBid\":\"100\","+
	"\"projectWorkType\":\"Hourly project\","+
	"\"projectDevLevel\":\"Intermediate\","+
	"\"projectBidEndDate\":"+newdate+","+
	"\"projectCompletionDate\":"+newdate+","+
	"\"createdUserName\":\"pras120687\","+
	"\"projectSkills\": ["+
        "{"+
           " \"skillId\": 5,"+
            "\"skillDescription\": \"Android\""+
        "}"+
    "]"+
	
"}").
	  when().
	  post("/cl/api/v1/projects/addProject/").
	  then().assertThat().statusCode(200);
	  
  }
}
