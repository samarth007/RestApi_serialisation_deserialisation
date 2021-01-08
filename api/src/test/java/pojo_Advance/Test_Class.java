package pojo_Advance;

import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Test_Class {

	
	@Test(enabled = false)
	public void testing() {
		
		Parent p= given().baseUri("https://reqres.in/api/users").queryParam("page", 2)
				.when().get().as(Parent.class);
		
		System.out.println(p.getData().get(2).getFirst_name());
				
	}
	
	
	@Test
	public void Serialising() {
		
	RequestSpecification reqspec = new RequestSpecBuilder().setBaseUri("https://reqres.in/")
			.setContentType(ContentType.JSON).build();
	
	Response res = given().spec(reqspec).body(Serialising_Class.CreateObject()).when()
			    .post("api/users").then().extract().response();
	
	String s = res.asString();
	System.out.println(s);
	
	JsonPath jp = new JsonPath(s);
	System.out.println(jp.getInt("id"));
	}
	
	
	
}
