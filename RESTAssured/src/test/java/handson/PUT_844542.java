package handson;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import BuildConfigue.configure;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class PUT_844542 extends configure{

	@Test
	public void create_new_user()
	{

		JSONObject request = new JSONObject();
		request.put("\n name", "morpheus");
		request.put("\n job", "leader");
		System.out.println(request.toJSONString());


		Response response = (Response) given().
				header("content-Type","application/json")
				.body(request.toJSONString())
				.when().post("https://reqres.in/api/users")
				.then().extract().response();

		Assert.assertEquals(201, response.getStatusCode());
		Assert.assertEquals("application/json; charset=utf-8",response.getHeader("content-Type"));
	}


	@Test
	public void update_the_user()
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("\n name", "morpheus");
		map.put("\n job", "zion resident");
		System.out.println(map.toString());


		Response response = (Response) given().
				body(map.toString()).when().post("https://reqres.in/api/users/2")
				.then().extract().response();

		Assert.assertEquals(201, response.getStatusCode());
		Assert.assertEquals("application/json; charset=utf-8",response.getHeader("content-Type"));
	}


	@Test public void errorvalidation_for_invalid() {


		Response response = (Response) given().
				when().post("https://reqres.in/api/users/2").then().extract().response();

		Assert.assertEquals(415, response.getStatusCode());
		Assert.assertEquals("text/html; charset=utf-8",response.getHeader("content-Type")); }


}
