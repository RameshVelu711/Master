package org.testng;

import org.base.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class LoginAutomation extends BaseClass{
	
	
	@Test
	public void login() {

		addHeaders("accept", "application/json");
		
		addBasicAuth("rameshriyo711@gmail.com", "Riyo@7111999");
		
		Response response = requestType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");
		
		int code = getStatusCode(response);
		System.out.println(code);
		
		
		String string = getResBodyAsPrettyString(response);
		System.out.println(string);
		
		
		
	}
	
	

}
