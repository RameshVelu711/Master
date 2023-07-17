package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown { public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	WebElement signbtn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	signbtn.click();
	
	Thread.sleep(2000);
	
	WebElement mnt = driver.findElement(By.id("month"));
	
	Select s = new Select(mnt);
	
	s.selectByValue("4");
	
	s.selectByVisibleText("Aug");
	
	s.selectByIndex(8);
	
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	
	
	}

}
