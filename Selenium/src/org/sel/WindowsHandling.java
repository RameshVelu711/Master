package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearch.sendKeys("iphone x",Keys.ENTER);
	
	WebElement iphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	
	
	Actions a = new Actions(driver);
	a.contextClick(iphone).perform();
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	String par = driver.getWindowHandle();
	System.out.println(par);
	
	Thread.sleep(3000);
	
	Set<String> allW = driver.getWindowHandles();
	System.out.println(allW);
	
	for (String each : allW) {
		
		if (!par.equals(each)) {
			driver.switchTo().window(each);
		}}
	
	WebElement cost = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[16]"));
	String text = cost.getText();
	System.out.println(text);
	
	
}}











