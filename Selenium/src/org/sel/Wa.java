package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Wa {
	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.amazon.in/");

		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("iphone",Keys.ENTER);

		/*
		 * List<WebElement> txtIphone =
		 * driver.findElements(By.xpath("//*[contains(text(),'Apple')]"));
		 * 
		 * for (int i = 0; i < txtIphone.size(); i++) {
		 * 
		 * WebElement element = txtIphone.get(i); String text = element.getText();
		 * System.out.println(text);
		 * 
		 * } String pageSource = driver.getPageSource(); System.out.println(pageSource);
		 */

		List<WebElement> txtSugg = driver.findElements(By.xpath("//*[contains(text(),'iphone')]"));
		for (int i = 0; i < txtSugg.size(); i++) {
			WebElement element = txtSugg.get(i);
		
		String text = element.getText();
		System.out.println(text);
	}}

}
