package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStep {

	WebDriver driver;

	@Given("user is on adactin hotel page")
	public void a() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@When("user should perform login {string},{string}")
	public void b(String name, String pass) {

		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys(name);

		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys(pass);

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	}

	@When("user should search hotels {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotels(String locat, String hotel, String roomtyp, String roomno, String CheckIn,
			String CheckOut, String AdultPerRoom, String ChildPerRoom) {

		WebElement location = driver.findElement(By.id("location"));
		location.sendKeys(locat);

		WebElement slcthotel = driver.findElement(By.id("hotels"));
		slcthotel.sendKeys(hotel);

		WebElement Roomtype = driver.findElement(By.id("room_type"));
		Roomtype.sendKeys(roomtyp);

		WebElement Roomnumber = driver.findElement(By.id("room_nos"));
		Roomnumber.sendKeys(roomno);

		WebElement ChkIn = driver.findElement(By.id("datepick_in"));
		ChkIn.sendKeys(CheckIn);

		WebElement ChkOut = driver.findElement(By.id("datepick_out"));
		ChkOut.sendKeys(CheckOut);

		WebElement Adultroom = driver.findElement(By.id("adult_room"));
		Adultroom.sendKeys(AdultPerRoom);

		WebElement ChildRoom = driver.findElement(By.id("child_room"));
		ChildRoom.sendKeys(ChildPerRoom);

		WebElement searchBtn = driver.findElement(By.id("Submit"));
		searchBtn.click();

	}

	@When("user should select hotel")
	public void user_should_select_hotel() {

		WebElement searchBtn = driver.findElement(By.id("radiobutton_0"));
		searchBtn.click();

		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
	}

	@When("user should book a hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_book_a_hotel(String firstName, String lastName, String address, String creditCard,
			String cardType, String selectMonth, String selectYear, String cvvNo) throws InterruptedException {

		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		txtFirstName.sendKeys(firstName);

		WebElement txtLastName = driver.findElement(By.id("last_name"));
		txtLastName.sendKeys(lastName);

		WebElement addrs = driver.findElement(By.xpath("//textarea[@name='address']"));
		addrs.sendKeys(address);

		WebElement cardNo = driver.findElement(By.id("cc_num"));
		cardNo.sendKeys(creditCard);

		WebElement cardTyp = driver.findElement(By.id("cc_type"));
		cardTyp.sendKeys(cardType);

		WebElement expiryMon = driver.findElement(By.id("cc_exp_month"));
		expiryMon.sendKeys(selectMonth);

		WebElement expiryYr = driver.findElement(By.id("cc_exp_year"));
		expiryYr.sendKeys(selectYear);

		WebElement cvvNum = driver.findElement(By.id("cc_cvv"));
		cvvNum.sendKeys(cvvNo);

		WebElement bookBtn = driver.findElement(By.id("book_now"));
		bookBtn.click();

	Thread.sleep(10000);
	
	}
	

	@Then("user should get order id")
	public void user_should_get_order_id() {
		WebElement orderId = driver.findElement(By.id("order_no"));
		String attribute = orderId.getAttribute("value");
		System.out.println(attribute);
		
		
		driver.quit();
	}



	
	
	
	

}
