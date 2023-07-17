package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		
		driver.get("https://www.zavvi.com/");
		
		Thread.sleep(5000);
		
		WebElement btnOk = driver.findElement(By.id("onetrust-accept-btn-handler"));
		btnOk.click();
		
		Thread.sleep(5000);

		WebElement btnCan = driver.findElement(By.className("emailReengagement_close_button"));
		btnCan.click();
		
		WebElement btnSearch = driver.findElement(By.xpath("//button[@class='headerSearch_toggleForm ']"));
		btnSearch.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		search.sendKeys("t shirt",Keys.ENTER);
		
		
		
		
		
	}

}
