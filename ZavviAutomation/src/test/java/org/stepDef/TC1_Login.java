package org.stepDef;

import org.base.BaseClass;
import org.junit.Assert;
import org.manager.PageObjectManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_Login extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on Zavvi Login page")
	public void userIsOnZavviLoginPage() throws InterruptedException {

		getDriver("chrome");
		enterAppUrl("https://www.zavvi.com/");

		implicityWait();

		pom.getLoginPage().getBtnOk().click();

		pom.getLoginPage().getBtnCancel().click();

	}

	@When("User perform search of product {string}")
	public void userPerformSearchOfProduct(String prod) {

		pom.getLoginPage().getBtnSearch().click();

		pom.getLoginPage().getBtnSearchBox().sendKeys(prod, Keys.ENTER);

	}

	@Then("User verify the searched items are displayed {string}")
	public void userVerifyTheSearchedItemsAreDisplayed(String expValue) {

		String actValue = pom.getLoginPage().getTxtVerify().getText();
		boolean b = actValue.contains("MARVEL");
		System.out.println(actValue);
		// Assert.assertEquals("verify after success of search message",expValue,"TV &
		// Movie Graphic T-Shirts");
		Assert.assertTrue("marvel contains messaage check", b);
	}

}
