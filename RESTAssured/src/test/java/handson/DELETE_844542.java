package handson;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import BuildConfigue.configure;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DELETE_844542 extends configure
{   
	
@Test
public void delete_the_user()
{
	 RestAssured.baseURI ="https://reqres.in/api/users/2";
	 
	Response response02= given()    
                           .when().delete("/api/users/2");
	response02.getStatusCode();
    response02.getHeader("content-Type");
    System.out.println(response02.getStatusCode());
    Assert.assertEquals(response02.getStatusCode(),204);
    System.out.println(response02.getHeader("content-Type"));
                         
}
@Test
public void errorvalidation_for_invalid()
{
	
	RestAssured.baseURI ="https://reqres.in/api/users/2";
	 
	Response response02= given()    
                           .when().delete("/api/users/2");
    Assert.assertEquals(response02.getStatusCode(),201);
    System.out.println(response02.getHeader("content-Type"));
   

}
}
