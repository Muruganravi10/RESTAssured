package handson;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class singleuser_844542 {
	
	@Test
	public void single_user()
	{
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-Type"));
		System.out.println(response.getTime());
		Assert.assertEquals(response.getStatusCode(),200);
		System.out.println("Valid status code" );
		Assert.assertEquals(response.getHeader("content-Type"), "application/json; charset=utf-8");
		
}
}
