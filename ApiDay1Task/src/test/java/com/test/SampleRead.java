	package com.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleRead {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		File file = new File(
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\ApiDay1Task\\src\\test\\resources\\ApiWrite.json");

		ObjectMapper map = new ObjectMapper();

		map.readValue(file, Root.class);
		
		//map.readValue(file, Data.class);
		
		
		

	}

}
