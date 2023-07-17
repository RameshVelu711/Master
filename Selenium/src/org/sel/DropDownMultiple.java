package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultiple {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://output.jsbin.com/osebed/2");

		Thread.sleep(3000);

		WebElement fruits = driver.findElement(By.id("fruits"));

		Select s = new Select(fruits);

		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Orange");

		Thread.sleep(2000);

		s.deselectAll();

		// select all options by Index
		List<WebElement> options2 = s.getOptions();
		for (int i = 0; i < options2.size(); i++) {
			s.selectByIndex(i);
		}

		s.deselectAll();

		// select all options by using value
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);

			String attribute = element.getAttribute("value");

			s.selectByValue(attribute);
		}
		s.deselectAll();

		// select all options by using Visible text
       List<WebElement> options3 = s.getOptions();

		for (int i = 0; i < options3.size(); i++) {
			WebElement element1 = options3.get(i);
			String text = element1.getText();
			s.selectByVisibleText(text);
		}
		//or for each
		for (WebElement webElement : options3) {
			String text = webElement.getText();
			System.out.println(text);
		}
		

		driver.quit();

	}

}
