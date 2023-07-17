package org.alert;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExceptions {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		List<WebElement> elements2 = driver.findElements(By.id("pass"));
		int size2 = elements2.size();

		if (size2 != 0) {
			System.out.println(size2);
			WebElement webElement = elements2.get(0);
			webElement.sendKeys("451545");
		} else {
			System.out.println("Locator not found.....");
		}
		
		// Handling exception without try and catch for Experienced person 

		List<WebElement> elements = driver.findElements(By.id("email"));
		int size = elements.size();

		if (size != 0) {
			System.out.println(size);
			WebElement element = elements.get(0);
			element.sendKeys("ABCD@123");
		} else {
			System.out.println("Locator not found.......");
		}
		
		//Handling exception by try catch this for fresher
		try {
			WebElement findElement = driver.findElement(By.name("login"));
			findElement.click();

		} catch (Exception e) {
			System.out.println("login not found");
		}

	}

}
