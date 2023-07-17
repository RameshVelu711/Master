package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParticularScreenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Roxy\\e\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");

		WebElement txtUserName = driver.findElement(By.xpath("//input[@maxlength='75']"));

		File file = txtUserName.getScreenshotAs(OutputType.FILE);

		File des = new File("D:\\Roxy\\e\\Selenium\\Target\\sample1.png");

		FileUtils.copyFile(file, des);

	}

}
