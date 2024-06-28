package APITesting.APITesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class PostGetMethodsTest {

	@Test
	public void postThenGetId() {
	 RestAssured.baseURI="https://rahulshettyacademy.com";
	 
	 
	 // adding the place 
	 
	String postOut = given().header("content-type", "application/json")
	 .body(PayLoads.addGooglePlace()).queryParam("key", "qaclick123").when().post("/maps/api/place/add/json")
	 .then().extract().response().asString();
	 

//	System.out.println(postOut);
	
	// parsing to json
	JsonPath jp = new JsonPath(postOut);
	String placeID = jp.getString("place_id");
	System.out.println("Place ID is "+placeID);
	
	// Get the posted place 
	
	given().header("content-type", "application/json").queryParam("key", "qaclick123").queryParam("place_id",placeID)
	.when().get("/maps/api/place/get/json");
	 
	// Delete the posted place
	
	given().header("content-type","application/json").queryParam("key", "qaclick123")
	.body(PayLoads.getGooglePlace("6fe7b97e5bc6624979d5d4e54bdf88bc")).when().delete("/maps/api/place/delete/json");
	
	}
	
	

}
