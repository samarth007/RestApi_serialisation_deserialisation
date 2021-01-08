package testNg;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Object_Class;

import static io.restassured.RestAssured.*;

public class Serilizing_api {

	RequestSpecification reqspec;
	ResponseSpecification resspec;
	Response res;
	
	@Test(priority = 1)
	public void setup() {
		
		reqspec = new RequestSpecBuilder().setBaseUri("https://reqres.in/")
				.setContentType(ContentType.JSON).build();
	}
	
	@Test(priority = 2)
	public void second() {
		
		resspec= new ResponseSpecBuilder().expectContentType(ContentType.JSON)
				.expectStatusCode(201).build();
	}
	
	@Test(priority = 3)
	public void third() {
		
		res= given().spec(reqspec).body(Object_Class.method()).when().post("api/users")
				.then().spec(resspec).extract().response();
		
		String s = res.asString();
		
		JsonPath js = new JsonPath(s);
		System.out.println(js.getString("id"));
	}
	
	
}
