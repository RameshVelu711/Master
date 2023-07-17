package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor { 

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	WebElement txtUser = driver.findElement(By.id("email"));
	
	js.executeScript("arguments[0].setAttribute('value','Riyo')", txtUser);
Thread.sleep(3000);	
	WebElement pass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','12345677')", pass);
	
Thread.sleep(3000);

	WebElement down = driver.findElement(By.xpath("//a[@title='Bengali']"));
	js.executeScript("arguments[0].scrollIntoView(true)", down);
	
	Thread.sleep(3000);
	
	js.executeScript("arguments[0].scrollIntoView(false)", txtUser);
	
	
}


}
