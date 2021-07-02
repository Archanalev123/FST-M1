package RestAssured;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class writedata {
	
	
String ROOT_URI = "https://petstore.swagger.io/v2/pet";
  @Test
  public void f() {
	  
	  File resJSONFile = new File("src/resLog.json");
	    Response response = 
	        given().contentType(ContentType.JSON) // Set headers
	        .when().get(ROOT_URI + "/77232"); // Send GET request
	 
	    // Get response body
	    String resBody = response.asPrettyString();
	 
	    try {
	        // Create log file
	        resJSONFile.createNewFile();
	        // Write response body to external file
	        FileWriter writer = new FileWriter(resJSONFile.getPath());
	        writer.write(resBody);
	        writer.close();
	    } catch (IOException excp) {
	        excp.printStackTrace();
	    }
  }
}
