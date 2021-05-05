package handson;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class UPDATE_844542 {
	@Test
	public void edit_the_user()
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("\n name", "morpheus");
		map.put("\n job", "zion resident");
		System.out.println(map.toString());
		
		
Response response = (Response) given().
                 body(map.toString()).when().post("https://reqres.in/api/users/2").then().statusCode(200);

             Assert.assertEquals(201, response.getStatusCode());
              Assert.assertEquals("application/json",response.getHeader("content-Type"));
	}

}
