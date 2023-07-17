package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.Endpoint;
import com.globaldatas.GlobalDatas;
import com.pojo.address.CityList;
import com.pojo.address.CityList_Input_Pojo;
import com.pojo.address.CityList_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC3_GetCityIdStep extends BaseClass {
	
	int cityId;
	Response response;

	static GlobalDatas globalDatas = new GlobalDatas();

	@Given("User add headers for the CityList")
	public void userAddHeadersForTheCityList() {
		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

	}


	@When("User send {string} request for CityList endpoint {string}")
	public void userSendRequestForCityListEndpoint(String stateId, String POST) {
		
		
		CityList_Input_Pojo cItyList_Input_Pojo = new CityList_Input_Pojo(stateId);
		addBody(cItyList_Input_Pojo);


		 response = requestType(POST, Endpoint.GETCITYLIST);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);

	}
	
	@Then("User verify the CityList response message matches {string} and saved city id")
	public void userVerifyTheCityListResponseMessageMatchesAndSavedCityId(String expCityName) {

		CityList_Output_Pojo cityList_Output_Pojo = response.as(CityList_Output_Pojo.class);
		ArrayList<CityList> cityList = cityList_Output_Pojo.getData();

		for (CityList eachCityList : cityList) {

			String actCityName = eachCityList.getName();
			if (actCityName.equals("Chennai")) {
				cityId = eachCityList.getId();
				System.out.println("city id " + cityId);

				Assert.assertEquals( "verify city name as Ooty",expCityName,actCityName);

				break;

			}
			}

	

	}
	

}
