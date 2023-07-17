package org.alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SimpleAlert {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		
		ChromeOptions chromeOptions = new ChromeOptions();
		ChromeOptions addArguments = chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://demo.automationtesting.in/Alerts.html");

		WebElement lnkBtn = driver.findElement(By.xpath("(//a[@class='analystic'])[1]"));
		lnkBtn.click();

		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btn.click();
//
//		Alert al = driver.switchTo().alert();
//		al.accept();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
