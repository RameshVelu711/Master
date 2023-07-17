package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreeenshot {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/");

		Thread.sleep(3000);

		WebElement userName = driver.findElement(By.xpath("//input[@maxlength='75']"));
		userName.sendKeys("Ramesh");

		Thread.sleep(3000);

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("2554");

		WebElement showBtn = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		showBtn.click();

		TakesScreenshot screen = (TakesScreenshot) driver;

		File file = screen.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\Roxy\\e\\Selenium\\Target\\sample.img");

		FileUtils.copyFile(file, des);
	}

}
