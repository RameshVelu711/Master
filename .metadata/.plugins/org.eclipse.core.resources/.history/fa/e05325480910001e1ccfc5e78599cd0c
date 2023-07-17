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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class MouseOverAction {public static void main(String[] args) throws  Exception  {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
	WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	btn.click();
	
	WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
	
	Actions ac = new Actions(driver);
	
	ac.moveToElement(more).perform();
	
	WebElement cus = driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"));
	cus.click();
	
	Thread.sleep(2000);
	
	TakesScreenshot screen = (TakesScreenshot) driver;
	File f = screen.getScreenshotAs(OutputType.FILE);
	
	File des = new File("C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Target\\sample.png");
	FileUtils.copyFile(f, des);
	
	
	Thread.sleep(3000);
	
	
	
}

}
