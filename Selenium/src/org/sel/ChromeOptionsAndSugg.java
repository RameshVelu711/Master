package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsAndSugg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		chromeOptions.addArguments("--disable-notification");
		chromeOptions.addArguments("--incognito");
		chromeOptions.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		// span[contains(text(),'selenium')]

		List<WebElement> bad = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));

		for (int i = 0; i < bad.size(); i++) {
			WebElement webElement = bad.get(i);
			String text = webElement.getText();
			System.out.println(text);

		}

		bad.get(2).click();

		Thread.sleep(3000);

		driver.quit();

	}
}