package org.dataprovider;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice extends BaseClass{

@DataProvider(name = "ram")
private Object[][] data() {

	Object[][] obj = new Object[][] {{"Ramesh","hello"},{"kumar","welcome"}};
	
	return obj;
}


@Test(dataProvider="ram")
private void integration(String s1, String s2) {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("facebook url");
	
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys(s1);
	System.out.println(s1);
	
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys(s2);
	System.out.println(s2);
	
	WebElement btnLogin = driver.findElement(By.id("login"));
	btnLogin.click();
	
	
	
	
	
	
}
}
