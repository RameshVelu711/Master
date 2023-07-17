package org.stepDef;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass {

	@Before
	private void before() {
		

	}

	@After
	private void after(Scenario scenario) {
		
		scenario.attach(screenShot(), "image/png", "after every scenario");


	}

}
