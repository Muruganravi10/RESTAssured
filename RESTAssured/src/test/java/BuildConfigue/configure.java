package BuildConfigue;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class configure 
{    

	
	public static Response delete_the_user (String baseURI)
	{
		
		RequestSpecification requests = RestAssured.given();
		Response response = requests.get(baseURI);
		return null;
		
	}
	public static Response retrive_the_user(String baseURI)
	{
		
		RequestSpecification requests = RestAssured.given();
		Response response = requests.get(baseURI);
		return null;
	}
	public static Response login(String baseURI)
	{
		
		RequestSpecification requests = RestAssured.given();
		Response response = requests.get(baseURI);
		return null;
	}
	public static Response create_new_user(String baseURI)
	{
		
		RequestSpecification requests = RestAssured.given();
		Response response = requests.get(baseURI);
		return null;
	}
	public static Response singleuser_844542(String baseURI)
	{
		
		RequestSpecification requests = RestAssured.given();
		Response response = requests.get(baseURI);
		return null;
	}
	public static Response edit_the_user(String baseURI)
	{
		
		RequestSpecification requests = RestAssured.given();
		Response response = requests.get(baseURI);
		return null;
	}
}
	
 