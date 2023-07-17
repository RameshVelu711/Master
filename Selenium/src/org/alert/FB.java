package org.alert;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FB {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		WebDriver	driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://www.facebook.com/");
	
	
	WebElement txtUser = driver.findElement(By.id("email"));
	
	
	
	
	Actions a = new Actions(driver);
	a.keyDown(Keys.SHIFT).perform();
	txtUser.sendKeys("vinoth");
	a.keyUp(Keys.SHIFT).perform();
	

}}
