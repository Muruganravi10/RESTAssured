package handson;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

public class PUT_844542 {
	@Test
	public void create_new_user()
	{

		JSONObject request = new JSONObject();
		request.put("\n name", "morpheus");
		request.put("\n job", "leader");
		System.out.println(request.toJSONString());


		Response response = (Response) given().
		header("content-Type","application/json")
		.body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);

		  Assert.assertEquals(201, response.getStatusCode());
		    Assert.assertEquals("application/json",response.getHeader("content-Type"));
	}


}
