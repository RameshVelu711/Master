package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeSuggestionprint {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(2000);
		// To get address of all the suggestions
		String xp = "//span[contains(text(),'selenium')]";

		List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
		// To count number of suggetions
//		int count = allSuggestions.size();
//		System.out.println(count);
		// To print all the suggestions
		for (int i = 0; i < allSuggestions.size(); i++) {
			WebElement suggestion = allSuggestions.get(i);
			String text = suggestion.getText();
			System.out.println(text);
		}
		allSuggestions.get(2).click();

		 driver.quit();

	}

}
