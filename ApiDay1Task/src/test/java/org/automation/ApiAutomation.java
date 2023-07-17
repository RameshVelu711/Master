package org.automation;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiAutomation {

	RequestSpecification reqSpec;

	private void listUser() {

		reqSpec = RestAssured.given();

		Response response = reqSpec.get("https://reqres.in/api/users?page=2");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String prettyString = response.asPrettyString();
		System.out.println(prettyString);

	}

	private void post() {
		reqSpec = RestAssured.given();

		reqSpec = reqSpec.body(
				"{\r\n" + "    \"email\": \"eve.holt@reqres.in\",\r\n" +
		"    \"password\": \"cityslicka\"\r\n" + "}");

		Response response = reqSpec.post("https://reqres.in/api/login");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String prettyString = response.asPrettyString();
		System.out.println(prettyString);

	}

	private void put() {

		reqSpec = RestAssured.given();

		reqSpec = reqSpec
				.body("{\r\n" + "    \"name\": \"morpheus\",\r\n" + "    \"job\": \"zion resident\"\r\n" + "}");

		Response response = reqSpec.put("https://reqres.in/api/users/2");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String prettyString = response.asPrettyString();
		System.out.println(prettyString);

	}

	private void delete() {
		reqSpec = RestAssured.given();

		Response response = reqSpec.delete("https://reqres.in/api/users/2");

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

		String prettyString = response.asPrettyString();
		System.out.println(prettyString);
	}

	public static void main(String[] args) {
		ApiAutomation api = new ApiAutomation();
		api.listUser();
		api.post();
		api.put();
		api.delete();
	}

}
