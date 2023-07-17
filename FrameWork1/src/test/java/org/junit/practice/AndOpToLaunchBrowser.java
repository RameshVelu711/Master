package org.junit.practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AndOpToLaunchBrowser {

	@Test
	public void tc1() {

		WebDriverManager.chromedriver();
		WebDriverManager.iedriver();
		WebDriverManager.firefoxdriver().setup();
		;

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://chat.openai.com/auth/login");

		WebDriver driver2 = new InternetExplorerDriver();

		driver2.get("https://chat.openai.com/auth/login");

		
		WebElement btnverify = driver.findElement(By.xpath("//*[@id=\"cf-stage\"]/div[6]/label/input"));
		btnverify.click();
	}

}
