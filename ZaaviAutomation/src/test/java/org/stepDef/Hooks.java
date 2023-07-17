package org.stepDef;

import org.base.BaseClass;
import org.manager.PageObjectManager;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	public static WebDriver driver;
	PageObjectManager pom = new PageObjectManager();

	@Before
	private void before() {
		
	}

	@After
	private void after() {

		driver.quit();

	}

}
