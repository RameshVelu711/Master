package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author Ramesh Riyo
 * @Date 18-01-2023
 * @see to maintain all reusable methods
 *
 */
public class BaseClass {
	
	public static Response response;
	RequestSpecification reqSpec;

	
		
		public void addHeaders(String key, String value) {

			reqSpec = RestAssured.given().header(key, value);

		}
		public void addHeaders(Headers headers) {
			reqSpec = RestAssured.given().headers(headers);

		}
		
		public void addBasicAuth(String userName, String password) {
	   reqSpec = reqSpec.auth().preemptive().basic(userName, password);
		}

		public void addQueryparam(String key, String value) {
			reqSpec = reqSpec.queryParam(key, value);
		}

		public void addPathparam(String key, String value) {
			reqSpec = reqSpec.pathParam(key, value);
		}

		public void addBody(String body) {
			reqSpec = reqSpec.body(body);
		}
		public void addBody(Object body) {
			reqSpec = reqSpec.body(body);
		}

		public Response requestType(String type, String endPoint) {
			switch (type) {
			case "GET":
				response = reqSpec.log().all().get(endPoint);
				break;
			case "POST":
				response = reqSpec.log().all().post(endPoint);
				break;
			case "PUT":
				response = reqSpec.log().all().put(endPoint);
				break;
			case "DELETE":
				response = reqSpec.log().all().delete(endPoint);
				break;
			default:
				break;
			}
			return response;
		}

		public int getStatusCode(Response response) {
			int code = response.getStatusCode();
			return code;
		}
		
		public String getResBodysString(Response response) {

			String asString = response.asString();
			System.out.println(asString);
			return asString;
		}
		
		public String getResBodyAsPrettyString(Response response) {

			String asPrettyString = response.asPrettyString();
			System.out.println(asPrettyString);
			return asPrettyString;
			
		}
		public String getProjectPath() {
			String path = System.getProperty("user.dir");
			return path;
		}

		
		public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
			Properties properties = new Properties();
			properties.load(new FileInputStream(getProjectPath() + "\\Config\\config.properties"));
			Object object = properties.get(key);
			String string = (String) object;
			return string;

		}
		
}