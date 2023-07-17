package com.apiwrite;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleWrite {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		File file = new File("C:\\Users\\Ramesh Riyo\\eclipse-workspace\\ApiWriteTask\\target\\new.json");
		
		ObjectMapper mapper = new ObjectMapper();

		SupportPojo pojo = new SupportPojo("https://reqres.in/#suppor\"t-heading",
				"To keep ReqRes free, contributions towards server costs are appreciated!");

		List<DatumPojo> list = new ArrayList<DatumPojo>();

		DatumPojo datumPojo = new DatumPojo(7, "michael.lawson@reqres.in", "Michael", "Lawson",
				"https://reqres.in/img/faces/7-image.jpg");
		DatumPojo datumPojo1 = new DatumPojo(8, "lindsay.ferguson@reqres.in", "Lindsay", "Ferguson",
				"https://reqres.in/img/faces/8-image.jpg");
		DatumPojo datumPojo2 = new DatumPojo(9, "byron.fields@reqres.in", "Byron", "Fields",
				"https://reqres.in/img/faces/10-image.jpg");
		DatumPojo datumPojo3 = new DatumPojo(10, "george.edwards@reqres.in", "George", "Edwards",
				"https://reqres.in/img/faces/11-image.jpg");

		list.add(datumPojo);
		list.add(datumPojo1);
		list.add(datumPojo2);
		list.add(datumPojo3);

		RootPojo pojo2 = new RootPojo(1, 2, 3, 4, list, pojo);

		mapper.writeValue(file, pojo2);

	}

}
