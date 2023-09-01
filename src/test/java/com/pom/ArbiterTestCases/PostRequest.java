package com.pom.ArbiterTestCases;

import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class PostRequest {
	@Test
	   
    public void post_request()
    {
		//int test = 1;
   
    String jsonString =  "{\n" +
            "  \"patron_id\": \"AutoUser\",\n" +
            "  \"post_id\": \"AutoPost\",\n" +
            "  \"application_id\": \"5RgNW8ZGUQxn5Pgklh3AhV\",\n" +
            "  \"url\": \"https://thumbs.dreamstime.com/b/man-aiming-shooting-caliber-hand-gun-gloves-man-aiming-shooting-caliber-hand-gun-wearing-gloves-138518892.jpg\" \n}";

    /*
    	Construct a request specification
    */
    RequestSpecification request= RestAssured.given();
   
    /*
    	Setting content type to specify the format in which the request payload will be sent.
    */
    request.contentType(ContentType.JSON);

    /*
    	Adding URI
    */
    request.baseUri("https://api.hivemoderation.com/api/v1/task/sync");

    /*
    	Adding body as string
    */
    request.header("Authorization", "token 2flaSSfWXfXhMoDbWtulmR");
    request.body(jsonString);
   
    /*
    	Calling POST method on URI. After hitting, we get Response
    */
    Response response = request.post();
   
    /*
    	Printing Response as string
    */
    System.out.println(response.asString());
   
    /*
    	Get Validatable response to perform validation
    */
    ValidatableResponse validatableResponse = response.then();
   
    /*
    	Validate status code as 201
    */
    validatableResponse.statusCode(200);

    System.out.println(response.getStatusCode());
    System.out.println(response.getTime());
    }
}

