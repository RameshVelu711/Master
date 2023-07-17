package com.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Dum {
	 public RequestSpecification requestSpecification;
	 Response response;
	
	private void tc1() {
		
	 requestSpecification = RestAssured.given();
	
	 response = requestSpecification.get();
	
	int statusCode = response.getStatusCode();
	
	String asPrettyString = response.asPrettyString();
	
	System.out.println("pretty");
	
	
	
	
	}
	
	private void put() {
		
response = requestSpecification.put();
response.body();
		
	}
	
}

