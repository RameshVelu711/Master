package com.stepdefinition;

import java.util.ArrayList;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.Endpoint;
import com.globaldatas.GlobalDatas;
import com.pojo.address.StateList;
import com.pojo.address.StateList_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC2_GetStateIdStep extends BaseClass {

	Response response;

	static GlobalDatas globalDatas = new GlobalDatas();

	@Given("User add headers for the StateList")
	public void userAddHeadersForTheStateList() {

		addHeaders("accept", "application/json");

	}

	@When("User send {string} request for StateList endpoint")
	public void userSendRequestForStateListEndpoint(String GET) {

		response = requestType(GET, Endpoint.GETSTATELIST);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);

	}

	@Then("User verify the StateList response message matches {string} and saved state id")
	public void userVerifyTheStateListResponseMessageMatchesAndSavedStateId(String expStateName) {

		StateList_Output_Pojo stateList_Output_Pojo = response.as(StateList_Output_Pojo.class);
		ArrayList<StateList> stateList = stateList_Output_Pojo.getData();

		for (StateList eachStateList : stateList) {
			String actStateName = eachStateList.getName();
			if (actStateName.equals("Tamil Nadu")) {
				int stateIdNum = eachStateList.getId();
				globalDatas.setStateIdNum(stateIdNum);
				
				String stateId = String.valueOf(stateIdNum);
				globalDatas.setStateId(stateId);
				Assert.assertEquals("verify state name as Tamil Nadu", expStateName, actStateName);
				System.out.println("state id num " + stateIdNum);
				break;
			}
		}
	}

}
