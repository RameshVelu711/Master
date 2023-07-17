package com.test;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiSample {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader(
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\ApiDay1Task\\src\\test\\resources\\ApiTask.json");

		JSONParser parser = new JSONParser();

		Object parse = parser.parse(reader);

		JSONObject jsonObject = (JSONObject) parse;

		Object object = jsonObject.get("data");
		System.out.println(object);

		Object object2 = jsonObject.get("support");
		System.out.println(object2);
		
		
	}

}
