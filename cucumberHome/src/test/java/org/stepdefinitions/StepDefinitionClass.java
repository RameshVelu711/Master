package org.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionClass {
	WebDriver driver;

	@Given("User is on the facebook")
	public void user_is_on_the_facebook() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
	}
	@When("User should perform Login")
	public void user_should_perform_login(io.cucumber.datatable.DataTable dataTable) {
	
		List<Map<String,String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		
		String string = map.get("userName");
		String string2 = map.get("password");
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys(string);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys(string2,Keys.ENTER);
	}
	
	
	@Then("User should verify after login success message")
	public void user_should_verify_after_login_success_message()  {

	}




}
