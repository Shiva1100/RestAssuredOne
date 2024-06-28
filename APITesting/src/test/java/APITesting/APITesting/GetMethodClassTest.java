package APITesting.APITesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;
public class GetMethodClassTest {
	
	@Test
	public void getAPIMethod() {
		RestAssured.baseURI = "https://api.tvmaze.com/";
	String getRes =	given().queryParam("embed", "show")
		.when().get("episodes/1")
		.then().assertThat().statusCode(200).extract().response().asString();
//		.then().extract().statusCode();
	// printing on to the console
	System.out.println("The final output: "+getRes);

	
	// reading particular attribute from response
	
	JsonPath js = new JsonPath(getRes);
	String id = js.getString("id");
	String url = js.getString("airtime");
	System.out.println("my id- "+id);
	System.out.println("my url- "+url);
//	js.getBo
//	
//	String medValue = js.getString("image.medium");
//	System.out.println("medValue: "+medValue);
//	
//	//traversing nested jsons
//	String genresVal = js.getString("_embedded.show.network.country.timezone");
//	System.out.println("genresVal: "+genresVal);
	
	
	}

}
