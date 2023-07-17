package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		ChromeOptions addArguments = options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(addArguments);
		
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		WebElement xBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		xBtn.click();
		
		WebElement searchBtn = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		searchBtn.sendKeys("Hp laptop",Keys.ENTER);
		
		

}}
