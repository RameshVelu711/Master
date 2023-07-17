package org.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebtableDynamic {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ramesh Riyo\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		ChromeOptions addArguments = chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver .manage().window().maximize();

		//
		// List<WebElement> coyNames =
		// driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		//
		// for (int i = 0; i < coyNames.size(); i++) {
		//
		// WebElement webElement = coyNames.get(i);
		// String text = webElement.getText();
		// System.out.println(text);
		//
		// }

		List<WebElement> coyNames = driver.findElements(By.xpath("//table[@class='dataTable']/thead"));
		 for (int i = 0; i < coyNames.size(); i++) {
				
				 WebElement webElement = coyNames.get(i);
				 String text = webElement.getText();
				 System.out.println(text);
				
				 }
		

		List<WebElement> coyNames1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody"));
		 for (int i = 0; i < coyNames.size(); i++) {
				
				 WebElement webElement = coyNames1.get(i);
				 String text = webElement.getText();
				// System.out.println(text);
				 
				 if (coyNames1.equals("Balaji Amines Li")) {
					System.out.println(text);
				}
				
				 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}
}