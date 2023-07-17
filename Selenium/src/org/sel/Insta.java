package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insta {
	public static void main(String[] args) {
//
//		ChromeOptions chromeOption = new ChromeOptions();
//
//		chromeOption.addArguments("--disable-notification");
//
//		chromeOption.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
//
//		chromeOption.addArguments("--incogito");
//
//		chromeOption.addArguments("--start-maximized");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");

		WebElement user = driver.findElement(By.xpath("//input[@maxlength='75']"));
		if (user.isDisplayed() && user.isEnabled()) {
			user.sendKeys("trhgbt3534635t");
			String text = user.getText();

			System.out.println(text);
		}

	}
}
