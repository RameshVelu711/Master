package com.stepdefinition;

import org.junit.Assert;

import com.base.BaseClass;

import io.cucumber.java.en.Then;

public class CommonSteps extends BaseClass{
	
	
	@Then("User verify the status code is {int}")
	public void userVerifyTheStatusCodeIs(int expStatusCode) {

int actStatusCode = TC1_LoginStep.globalDatas.getStatusCode();
Assert.assertEquals("verifying status code", expStatusCode,actStatusCode);

int actStatusCode2 = TC2_GetStateIdStep.globalDatas.getStatusCode();
Assert.assertEquals("verifying status code", expStatusCode,actStatusCode2);


int actStatusCode3 = TC3_GetCityIdStep.globalDatas.getStatusCode();
Assert.assertEquals("verifying status code", expStatusCode,actStatusCode3);


int actStatusCode4 = TC4_AddressStep.globalDatas.getStatusCode();
Assert.assertEquals("verifying status code", expStatusCode,actStatusCode4);

int actStatusCode5 = TC5_SearchProductStep.globaldatas.getStatusCode();
Assert.assertEquals("verifying status code", expStatusCode,actStatusCode5);




	}
	
	
}
