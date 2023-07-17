package org.alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmAlert {


	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ramesh Riyo\\\\eclipse-workspace\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
		

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);

		
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement lnkBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		lnkBtn.click();
		
		boolean selected = lnkBtn.isEnabled();
		System.out.println(selected);
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn.click();
//		
//		Alert al = driver.switchTo().alert();
//		al.dismiss(); 
//		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
}}
