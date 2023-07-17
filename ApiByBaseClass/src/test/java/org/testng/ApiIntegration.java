package org.testng;

import org.base.BaseClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class ApiIntegration extends BaseClass {

	@Test(priority = 0)
	public void getListUser() {
		addHeaders("accept", "application");

		Response requestType = requestType("GET", "https://reqres.in/api/users?page=2");

		int statusCode = getStatusCode(requestType);
		System.out.println(statusCode);

		String prettyString = getResBodyAsPrettyString(requestType);
		System.out.println(prettyString);

	}

	@Test(priority = 1)
	public void createUser() {
		addHeaders("accept", "application");

		addBody("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"leader\"\r\n" + "}");

		Response response2 = requestType("POST", "https://reqres.in/api/users");

		int statusCode = getStatusCode(response2);
		System.out.println(statusCode);

		String prettyString = getResBodyAsPrettyString(response2);
		System.out.println(prettyString);

	}

	@Test(priority = 2)
	public void updateUser() {

		addHeaders("accept", "application");

		addBody("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}");

		Response response3 = requestType("PUT", "https://reqres.in/api/users/2");

		int statusCode = getStatusCode(response3);
		System.out.println(statusCode);

		String prettyString = getResBodyAsPrettyString(response3);
		System.out.println(prettyString);

	}

	@Test(priority = 3)
	private void deleteUser() {
		addHeaders("accept", "application");

		Response response4 = requestType("DELETE", "https://reqres.in/api/users/2");

		
	}

}
