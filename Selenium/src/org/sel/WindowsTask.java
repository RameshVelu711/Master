package org.sel;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTask {
public static void main(String[] args) throws AWTException, InterruptedException {
	 System.setProperty("webdiver.cjhrome.drier", "C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	 
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://greenstech.in/selenium-course-content.html");
	 
  WebElement frame = driver.findElement(By.xpath("//div[@id='heading304']"));
  frame.click();
  
  Robot r = new Robot();
  
  for (int r1 = 0; r1 < 2; r1++) {
	  r.keyPress(KeyEvent.VK_TAB);
	  r.keyRelease(KeyEvent.VK_TAB);
}
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER); 
    
    String par = driver.getWindowHandle();
    System.out.println(par);
    
    Thread.sleep(3000);
    
    Set<String> allW = driver.getWindowHandles();
    
    List<String> li = new ArrayList<String>();
    
    li.addAll(allW);
    System.out.println(allW);
    
    String string = li.get(1);
    driver.switchTo().window(string);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}

}
