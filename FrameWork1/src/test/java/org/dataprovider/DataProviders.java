package org.dataprovider;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders extends BaseClass {

	@DataProvider(name = "res")
	public Object[][] datas() {
		Object[][] obj = new Object[2][2];

		obj[0][0] = "Ramesh";
		obj[0][1] = "Hello";
		// obj[0][2]= "Java";

		obj[1][0] = "Riyo";
		obj[1][1] = "Welcome";
		// obj[1][2]= "Selenium";

		return obj;
	}

	@Test(dataProvider = "res")
	private void dataProvider(String s1, String s2) {

		System.out.println(s1);
		System.out.println(s2);
		// System.out.println(s3);

	}

}
