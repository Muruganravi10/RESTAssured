package handson;

import org.testng.Assert;
import org.testng.annotations.Test;

import BuildConfigue.configure;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_844542 extends configure {

	@Test
	public void retrive_the_user ()
	{   
		 RestAssured.baseURI ="https://reqres.in/api/users/2";
		 
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
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
