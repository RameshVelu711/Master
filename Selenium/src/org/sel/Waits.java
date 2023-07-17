package org.sel;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Ramesh Riyo\\\\eclipse-workspace\\\\Selenium\\\\Drivers\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		
		//implicitWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// webdriver wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		until.accept();

		// fluentWait
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(Throwable.class);

		Alert until2 = w.until(ExpectedConditions.alertIsPresent());

		until2.accept();

	}
}
