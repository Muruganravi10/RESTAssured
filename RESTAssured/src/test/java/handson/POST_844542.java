package handson;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import BuildConfigue.configure;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class POST_844542 extends configure{

	@Test
	public void login()
	{
		JSONObject a = new JSONObject();
		a.put("email", "eve.holt@reqres.in");
		a.put("password", "cityslicka");		
		System.out.println(a.toJSONString());

		Response response = (Response) given().
				body(a.toJSONString()).when().post("https://reqres.in/api/login").
				then().statusCode(200);
		
		
		Assert.assertEquals(200, response.getStatusCode());
		 Assert.assertEquals("application/json",response.getHeader("content-Type"));
	}
}
