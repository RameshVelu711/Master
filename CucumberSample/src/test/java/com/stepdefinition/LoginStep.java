package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;

	@Given("user is on adactin hotel page")
	public void user_is_on_adactin_hotel_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	
	@When("user should enter username and password")
	public void user_should_enter_username_and_password() {
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys("Rameshriyo711");
		WebElement txtPassWord = driver.findElement(By.id("password"));
		txtPassWord.sendKeys("51W0YV");
	}
	
	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();
	}
	
	@Then("user should verifying after login succes message")
	public void user_should_verifying_after_login_succes_message() {
		
		WebElement verifyAfterLogin = driver.findElement(By.name("username_show"));
		String message = verifyAfterLogin.getAttribute("value");
		Assert.assertEquals("verify after login success message", "Hello Rameshriyo711!", message);
	}




}
