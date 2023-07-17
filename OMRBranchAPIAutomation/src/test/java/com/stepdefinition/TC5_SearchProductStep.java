package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.Endpoint;
import com.globaldatas.GlobalDatas;
import com.pojo.product.SearchProduct_Input_Pojo;
import com.pojo.product.SearchProduct_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class TC5_SearchProductStep extends BaseClass {

	static GlobalDatas globaldatas = new GlobalDatas();

	@Given("User add headers for search product")
	public void userAddHeadersForSearchProduct() {

		List<Header> listHeader = new ArrayList<Header>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

	}

	@Given("User send {string} request for search product endpoint")
	public void userSendRequestForSearchProductEndpoint(String POST) {
		response = requestType(POST, Endpoint.SEARCHPRODUCT);

		int actStatusCode = getStatusCode(response);
		globaldatas.setStatusCode(actStatusCode);

	}

	@Given("User add request body for search product {string}")
	public void userAddRequestBodyForSearchProduct(String string) {
		SearchProduct_Input_Pojo input_Pojo = new SearchProduct_Input_Pojo("nuts");
		addBody(input_Pojo);

	}

	@Then("User verify the search product response body message {string}")
	public void userVerifyTheSearchProductResponseBodyMessage(String expSearchProdMsg) {
		SearchProduct_Output_Pojo searchProduct_Output_Pojo = response.as(SearchProduct_Output_Pojo.class);

		String actSearchProdMsg = searchProduct_Output_Pojo.getMessage();
		Assert.assertEquals("verify search product OK message", expSearchProdMsg, actSearchProdMsg);
	}

}
