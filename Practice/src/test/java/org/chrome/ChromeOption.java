package org.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOption {

	public static void main(String[] abcd) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--disable-notifications");

		chromeOptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

	//	 chromeOptions.addArguments("--incognito");

		chromeOptions.addArguments("--start-maximized");

		//chromeOptions.addArguments("--headless");

		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://bazaar.shopclues.com/");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//		WebElement btnAllow = driver.findElement(By.xpath("//button[text()='Allow']"));
//
//		btnAllow.click();
//		

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String title = driver.getTitle();
		System.out.println(title);

	}

}
