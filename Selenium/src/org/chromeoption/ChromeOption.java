package org.chromeoption;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOption = new ChromeOptions();

		chromeOption.addArguments("--remote-allow-origins=*");
		

		chromeOption.addArguments("--disable-notification");

		chromeOption.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

		chromeOption.addArguments("--incogito");

		chromeOption.addArguments("--start-maximized");

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Ramesh Riyo\\\\eclipse-workspace\\\\Selenium\\\\Drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(chromeOption);

		driver.get("https://bazaar.shopclues.com/");
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement btnDontAllow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div[1]/button[1]"));
		btnDontAllow.click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
