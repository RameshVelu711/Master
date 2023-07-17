package org.ac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyWords { public static void main(String[] args) throws AWTException {
	
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\ActionsSelenium\\Driver\\chromedriver_win32");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	WebElement txtUser = driver.findElement(By.xpath("//input[@maxlength='15']"));
	
	Robot robot = new Robot();
	
	robot.keyPress(KeyEvent.VK_R);
	robot.keyRelease(KeyEvent.VK_R);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
