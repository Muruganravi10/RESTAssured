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
		a.put("email","eve.holt@reqres.in");
		a.put("password", "cityslicka");		
		System.out.println(a.toJSONString());

		Response response = (Response) given().
				body(a.toJSONString()).when().post("https://reqres.in/api/login").
				then().extract().response();


		Assert.assertEquals(400, response.getStatusCode());
		Assert.assertEquals("application/json; charset=utf-8",response.getHeader("content-Type"));
	}

	@Test
	public void errorvalidation_for_invalidlogin()
	{

		Response response = (Response) given().
				when().post("https://reqres.in/api/login").
				then().extract().response();


		Assert.assertEquals(415, response.getStatusCode());
		Assert.assertEquals("text/html; charset=utf-8",response.getHeader("content-Type"));

	}
}
