package org.emp;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Practice {
	RequestSpecification reqSpec;
	Response response;
	
	@Test
	private void tc1() {

	 reqSpec = RestAssured.given();
	
	 response = reqSpec.get("https://reqres.in/api/users?page=2");
	
	int code = response.getStatusCode();
	
	System.out.println(code);
	
	String text = response.asPrettyString();
	
	System.out.println(text);
	

	
	}
	
	@Test
	private void tc2() {

		 reqSpec = RestAssured.given();
		 
		 reqSpec = reqSpec.body(
					"{\r\n" + 
					"    \"name\": \"morpheus\",\r\n" + 
					"    \"job\": \"leader\"\r\n" + 
					"}");

			 response  = reqSpec.post("https://reqres.in/api/users");

			
			int code = response.getStatusCode();
			
			System.out.println(code);
			
			String text = response.asPrettyString();
			
			System.out.println(text);
			
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
