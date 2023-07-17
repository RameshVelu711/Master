package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
	
	WebElement s = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
	WebElement d = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
	
	WebElement s1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	WebElement d1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
	WebElement s2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
	WebElement d2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
	
	WebElement s3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
	WebElement d3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
	
	Actions a = new Actions(driver);
	
	a.dragAndDrop(s, d).perform();
	a.dragAndDrop(s1, d1).perform();
	a.dragAndDrop(s2, d2).perform();
	a.dragAndDrop(s3, d3).perform();
	
	WebElement element = driver.findElement(By.xpath("//a[@class='button button-green']"));
	String text = element.getText();
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
