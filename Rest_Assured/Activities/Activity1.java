package RestAssured;

import static io.restassured.RestAssured.given;

import static org.hamcrest.CoreMatchers.equalTo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Activity1 {
	
	
private static final String KeyId = null;
RequestSpecification requestSpec; 
String SSHkey;

int id;
@BeforeClass
public void setUp() {
    // Create request specification
    requestSpec = new RequestSpecBuilder()
        .setContentType(ContentType.JSON)
        .setBaseUri("https://api.github.com")
        .addHeader("Authorization","token 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")
        .build();
}
 

	 @Test(priority=0)
	    public void addingSSHKey() {
	        // Create JSON request
	        String reqBody = "{"
	            + "\"title\": \"TestAPIKey\","
	            + "\"key\": \"ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDeCf5O76qz7JZ5HpVY6pRW3lXBSm7OeJ7uN60R8VefSBVkezHGa1uspdUIbs2LD9OlcluxTuW7LFS5HIEGuZlKIRe3iAtFkUK5VEtVRhEROm0/YZG0vtHE9bkZt1LG+gKUcvKt47zJSpgD2c1vbjd2Jch0bd3IVpql61R+mI40cJMXUGMiUen77YaEIhHdEbRcVgGdncViq3eGuT2fpLF3QWv353dwgey0Os9PkaXPdDgv4h3SevA4+uF82BUeACtSKta+QXxquPFJmT0HGEiJQ59FHq5sNk9Jjfj4rTNiKMgJqQ0sZiGO/haeJPjRnTD1JyxbNllpt4vyGvL3nvML\""
	        + "}";
	 
	        Response response = 
	        		given().spec(requestSpec)
	        		.body(reqBody)
	        		.post("/user/keys"); // Send POST request
	        
	        System.out.println(response.getBody().asString());
	        id = response.then().extract().path("id");
	        response.getBody().asString();
			System.out.println(String.valueOf(id));  
	        response.then().statusCode(201);
	 
	    }

 
/*@Test(priority=1)
   public void Retrivingsshkey()
{
    Response response = 
        given().spec(requestSpec) // Use requestSpec
        .get("/user/keys"); // Send GET request
 
    // Print response
    String body = response.getBody().asPrettyString();
    System.out.println(body);
    
    int keyId = response.then().extract().path("[1].id");
    System.out.println(keyId);
    // Assertion
    response.then().statusCode(200);
  }*/

@Test(priority=2)
public void Deletesshkey()
{
	
	 System.out.println(id);
 Response response = 
     given().spec(requestSpec)
    .pathParam("keyId",id)
     .delete("/user/keys/{keyId}");
    

 // Print response
 String body = response.getBody().asPrettyString();
 
 System.out.println(body);

 // Assertion
 response.then().statusCode(204);
}
}
