package APITesting.APITesting;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
public class PutMethodClass {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "";
		given().log().all().header("content-type", "applications/json")
		.queryParam("key", "qaclick123")
		.body(PayLoads.addGooglePlace()).when();
		

	}

}
