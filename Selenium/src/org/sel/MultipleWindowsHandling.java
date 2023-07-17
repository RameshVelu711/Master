package org.sel;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsHandling {public static void main(String[] args) throws AWTException, InterruptedException {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe" );
	
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.amazon.com/");
	
	WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtSearch.sendKeys("iphone x",Keys.ENTER);
	
	WebElement iphone = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2"));
	
	
	Actions a = new Actions(driver);
	a.contextClick(iphone).perform();
	
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_DOWN); 
	r.keyRelease(KeyEvent.VK_DOWN);  
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	String par = driver.getWindowHandle();
	System.out.println(par);
	
// webdriverwait-->explicit wait
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	
	Set<String> set = driver.getWindowHandles();
	System.out.println(set);
	
	
	List<String> li = new ArrayList<String>();

	  li.addAll(set);
		System.out.println(li);
		
		
	  String aa = li.get(1);
	driver.switchTo().window(aa);
	
	WebElement until = w.until(ExpectedConditions.elementToBeClickable(By.id("bylineInfo")));
	until.click();

	
	Thread.sleep(3000);

	String string = li.get(0);
	
	driver.switchTo().window(string);

	



}}
