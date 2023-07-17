package org.sel;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crocs {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement btnCancel = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		btnCancel.click();

		WebElement btnSearch = driver.findElement(By.name("q"));
		btnSearch.sendKeys("Crocs for mens clog", Keys.ENTER);

		WebElement btnNextClick = driver.findElement(By.xpath("//a[text()='2']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", btnNextClick);

		btnNextClick.click();

		WebElement btnCrocsClick = driver.findElement(By.xpath("//div[text()='₹3,795']"));

		js.executeScript("arguments[0].scrollIntoView(false)", btnCrocsClick);

		btnCrocsClick.click();

		String par = driver.getWindowHandle();

		Set<String> allW = driver.getWindowHandles();
		for (String each : allW) {

			if (!par.equals(each)) {
				driver.switchTo().window(each);

			}
		}

		// Set<String> allWin = driver.getWindowHandles();
		//
		// List<String> li = new ArrayList<>();
		// li.addAll(allWin);
		//
		// String NxtWin = li.get(1);
		// driver.switchTo().window(NxtWin);

		WebElement txtCheck = driver.findElement(By.xpath("//input[@placeholder='Enter delivery pincode']"));
		txtCheck.sendKeys("600039", Keys.ENTER);

		WebElement btnSize = driver.findElement(By.xpath("//a[text()='6']"));
		btnSize.click();

		WebElement txtScrollDn = driver.findElement(By.xpath("//span[text()='Frequently Bought Together']"));
		js.executeScript("arguments[0].scrollIntoView(false)", txtScrollDn);

		WebElement btnBuyNow = driver.findElement(By.xpath("//button[text()='Buy Now']"));
		btnBuyNow.click();

		WebElement txtMbNo = driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		txtMbNo.sendKeys("8072690665");

		// WebElement btnContinue =
		// driver.findElement(By.xpath("//span[text()='CONTINUE']"));
		// btnContinue.click();

		Thread.sleep(3000);

		driver.quit();

	
		
	}}

