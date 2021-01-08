package testNg;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import pojo.pojo_2;


public class DeSeriizing_api {

	
	@Test
	public void get() {
		
		pojo_2 pp = given().baseUri("https://reqres.in/api/users/2").when()
				.get().as(pojo_2.class);
		
		System.out.println(pp.getData().getLast_name());
	}
	
}
