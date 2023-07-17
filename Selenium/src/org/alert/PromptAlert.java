package org.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Ramesh Riyo\\\\eclipse-workspace\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement lnkBTn = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		lnkBTn.click();
		
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		btn.click();
		
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		
		al.sendKeys("Ramesh");
		al.accept();
		
		
		
		
	}	

}
