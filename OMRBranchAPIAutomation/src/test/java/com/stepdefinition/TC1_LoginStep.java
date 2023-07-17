package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.Endpoint;
import com.globaldatas.GlobalDatas;
import com.pojo.login.Login_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_LoginStep extends BaseClass {

	Response response;

	static GlobalDatas globalDatas = new GlobalDatas();

	@Given("User add header")
	public void userAddHeader() {

		addHeaders("accept", "application/json");

	}

	@When("User add basic authentication for login")
	public void userAddBasicAuthenticationForLogin() throws FileNotFoundException, IOException {

		addBasicAuth(getPropertyFileValue("username"), getPropertyFileValue("password"));
		System.out.println(getPropertyFileValue("username"));
		System.out.println(getPropertyFileValue("password"));

	}

	@When("User send {string} request for login endpoint")
	public void userSendRequestForLoginEndpoint(String POST) {

		response = requestType(POST, Endpoint.POSTMANBASICAUTHLOGIN);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);

	}

	@Then("User verify the login response body firstname present as {string} and get the logtoken saved")
	public void userVerifyTheLoginResponseBodyFirstnamePresentAsAndGetTheLogtokenSaved(String expFirstName) {

		Login_Output_Pojo login_Output_Pojo = response.as(Login_Output_Pojo.class);
		String actFirstName = login_Output_Pojo.getData().getFirst_name();
		Assert.assertEquals("verifying first name", expFirstName, actFirstName);
		String logtoken = login_Output_Pojo.getData().getLogtoken();
		globalDatas.setLogtoken(logtoken);
	}

}
