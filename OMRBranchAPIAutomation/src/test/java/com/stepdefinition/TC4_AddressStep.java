package com.stepdefinition;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.base.BaseClass;
import com.endpoints.Endpoint;
import com.globaldatas.GlobalDatas;
import com.pojo.address.AddUserAddress_Input_Pojo;
import com.pojo.address.AddUserAddress_Output_Pojo;
import com.pojo.address.DeleteUserAddress_Input_Pojo;
import com.pojo.address.DeleteUserAddress_Output_Pojo;
import com.pojo.address.GetUserAddress_Output_Pojo;
import com.pojo.address.UpdateUserAddress_Input_Pojo;
import com.pojo.address.UpdateUserAddress_Output_Pojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC4_AddressStep extends BaseClass {

	Response response;

	static GlobalDatas globalDatas = new GlobalDatas();

	@Given("User add headers and bearer authorization for accessing add address endpoint")
	public void userAddHeadersAndBearerAuthorizationForAccessingAddAddressEndpoint() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + globalDatas.getLogtoken());
		Header h3 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);
	}

	@When("User add request body for add new address {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userAddRequestBodyForAddNewAddressAnd(String first_name, String last_name, String mobile,
			String apartment, String state, String city, int country, String zipcode, String address,
			String address_type) {

		AddUserAddress_Input_Pojo address_Input_Pojo = new AddUserAddress_Input_Pojo(first_name, last_name, mobile,
				apartment, globalDatas.getStateIdNum(), globalDatas.getCityId(), country, zipcode, address,
				address_type);

		addBody(address_Input_Pojo);

	}

	@When("User send {string} request for addUserAddress endpoint")
	public void userSendRequestForAddUserAddressEndpoint(String POST) {

		response = requestType(POST, Endpoint.ADDUSERADDRESS);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);
	}

	@Then("User verify the addUserAddress response message matches {string}")
	public void userVerifyTheAddUserAddressResponseMessageMatches(String expAddmsg) {
		AddUserAddress_Output_Pojo addUser = response.as(AddUserAddress_Output_Pojo.class);

		String actAddMsg = addUser.getMessage();
		int address_idNum = addUser.getAddress_id();
		String address_id = String.valueOf(address_idNum);

		System.out.println("address id " + address_id);
		Assert.assertEquals("verify address added success message", expAddmsg, actAddMsg);

	}

	@Given("User add headers and bearer authorization for accessing update address endpoint")
	public void userAddHeadersAndBearerAuthorizationForAccessingUpdateAddressEndpoint() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogtoken());
		Header h3 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

	}

	@When("User add request body for update address  {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userAddRequestBodyForUpdateAddressAnd(String address_id, String first_name, String last_name,
			String mobile, String apartment, int state, int city, int country, String zipcode, String address,
			String address_type) {

		UpdateUserAddress_Input_Pojo address_Input_Pojo = new UpdateUserAddress_Input_Pojo(address_id, first_name,
				last_name, mobile, apartment, state, city, country, zipcode, address, address_type);
		addBody(address_Input_Pojo);

	}

	@When("User send {string} request for updateUserAddress endpoint")
	public void userSendRequestForUpdateUserAddressEndpoint(String PUT) {

		response = requestType(PUT, Endpoint.UPDATEUSERADDRESS);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);

	}

	@Then("User verify the updateUserAddress response message matches {string}")
	public void userVerifyTheUpdateUserAddressResponseMessageMatches(String expUpdateMsg) {

		UpdateUserAddress_Output_Pojo updateUserAddress_Output_Pojo = response.as(UpdateUserAddress_Output_Pojo.class);
		String actUpdateMsg = updateUserAddress_Output_Pojo.getMessage();
		System.out.println(actUpdateMsg);
		Assert.assertEquals("verify address updated success message", expUpdateMsg, actUpdateMsg);

	}

	@Given("User add headers and bearer authorization for accessing get address endpoint")
	public void userAddHeadersAndBearerAuthorizationForAccessingGetAddressEndpoint() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogtoken());

		listHeader.add(h1);
		listHeader.add(h2);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);
	}

	@Given("User send {string} request for getUserAddress endpoint")
	public void userSendRequestForGetUserAddressEndpoint(String GET) {

		response = requestType(GET, Endpoint.GETUSERADDRESS);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);

	}

	@Then("User verify the getUserAddress response message matches {string}")
	public void userVerifyTheGetUserAddressResponseMessageMatches(String expGetAddMsg) {

		GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response.as(GetUserAddress_Output_Pojo.class);
		String actGetAddMsg = getUserAddress_Output_Pojo.getMessage();
		org.junit.Assert.assertEquals("verify get user address message as ok", expGetAddMsg, actGetAddMsg);

	}

	@Given("User add headers and bearer authorization for accessing delete address endpoint")
	public void userAddHeadersAndBearerAuthorizationForAccessingDeleteAddressEndpoint() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + TC1_LoginStep.globalDatas.getLogtoken());
		Header h3 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);
	}

	@When("User add request body for delete address {string}")
	public void userAddRequestBodyForDeleteAddress(String address_id) {

		DeleteUserAddress_Input_Pojo address_Input_Pojo = new DeleteUserAddress_Input_Pojo(address_id);
		addBody(address_Input_Pojo);
	}

	@When("User send {string} request for deleteUserAddress endpoint")
	public void userSendRequestForDeleteUserAddressEndpoint(String DELETE) {

		response = requestType(DELETE, Endpoint.DELETEUSERADDRESS);

		int actStatusCode = getStatusCode(response);
		globalDatas.setStatusCode(actStatusCode);

	}

	@Then("User verify the deleteUserAddress response message matches {string}")
	public void userVerifyTheDeleteUserAddressResponseMessageMatches(String expDelAddMsg) {

		DeleteUserAddress_Output_Pojo address_Output_Pojo = response.as(DeleteUserAddress_Output_Pojo.class);

		String actDelAddMsg = address_Output_Pojo.getMessage();
		Assert.assertEquals("verify user address delete success message", expDelAddMsg, actDelAddMsg);
	}

}
