package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.JavascriptExecutor;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		ChromeOptions addArguments = chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://demo.guru99.com/test/guru99home/");

		driver.switchTo().frame("a077aa5e");

		WebElement frame = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", frame);
		Thread.sleep(5000);


		frame.click();

		driver.switchTo().parentFrame();

		Thread.sleep(5000);
		driver.quit();

	}

}
