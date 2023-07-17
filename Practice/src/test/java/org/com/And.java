package org.com;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class And extends BaseClass {
	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("ab");

	
	}
}
