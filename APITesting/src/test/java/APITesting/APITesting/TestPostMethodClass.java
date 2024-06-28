package APITesting.APITesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import javax.swing.text.AbstractDocument.Content;

import org.testng.annotations.Test;

public class TestPostMethodClass {

	@Test
	public void postMethod() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().header("Content-type","application/json").queryParam("Key", "qaclick123")
		// below commented lines cab be removed and comment 19th line(body())
//		.body("{\r\n" + 
//				"    \"name\": \"morpheus\",\r\n" + 
//				"    \"job\": \"leader\"\r\n" + 
//				"    \r\n" + 
//				"}").when().post("/api/users")
		.body(PayLoads.addGooglePlace()).when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200)
		
		.header("Server", "Apache/2.4.52 (Ubuntu)");
		
		// extracting the response into variable 
		
		
		
		
//		String resData = given().header("Content-type", "application/json")
//		.body(payloadAddUsers()).when().post("/api/users")
//		.then().log().all().extract().response().asString();
//		
//		System.out.println("Response Data: "+resData);
//		
//		// reading json specific attribute value from response
//		JsonPath jsp = new JsonPath(resData);
//		String createdTime = jsp.getString("createdAt");
//		
//		System.out.println("Created Time: "+createdTime);

	}
	
	

	
	

}
