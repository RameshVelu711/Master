package org.pojo;

import java.util.ArrayList;
import java.util.List;

import org.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.http.Header;
import io.restassured.http.Headers;

public class SampleExecution extends BaseClass {
	String logtoken;
	String stateId;
	int stateIdNum;
	int cityId;
	String address_id;

	@Test(priority = 1)
	public void login() {

		addHeaders("accept", "application/json");

		addBasicAuth("rameshriyo711@gmail.com", "Riyo@7111999");

		Response response = requestType("POST", "https://omrbranch.com/api/postmanBasicAuthLogin");

		int actStatusCode = getStatusCode(response);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		Login_Output_Pojo login_Output_Pojo = response.as(Login_Output_Pojo.class);
		String first_name = login_Output_Pojo.getData().getFirst_name();
		Assert.assertEquals(first_name, "Ramesh", "verify firstname");

		logtoken = login_Output_Pojo.getData().getLogtoken();
	}

	@Test(priority = 2)
	public void getStateList() {

		addHeaders("accept", "application/json");

		Response response = requestType("GET", "https://omrbranch.com/api/stateList");

		int actStatusCode = getStatusCode(response);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		StateList_Output_Pojo stateList_Output_Pojo = response.as(StateList_Output_Pojo.class);
		ArrayList<StateList> stateList = stateList_Output_Pojo.getData();

		for (StateList eachStateList : stateList) {
			String actStateName = eachStateList.getName();
			// System.out.println(actStateName);
			if (actStateName.equals("Tamil Nadu")) {
				stateIdNum = eachStateList.getId();

				stateId = String.valueOf(stateIdNum);
				Assert.assertEquals(actStateName, "Tamil Nadu", "verify state name as Tamil Nadu");
				System.out.println("state id num " + stateIdNum);
				break;
			}
		}
	}

	@Test(priority = 3)
	public void cityList() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

		// payload
		CityList_Input_Pojo cItyList_Input_Pojo = new CityList_Input_Pojo(stateId);
		addBody(cItyList_Input_Pojo);

		Response response = requestType("POST", "https://omrbranch.com/api/cityList");

		int actStatusCode = getStatusCode(response);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		CityList_Output_Pojo cityList_Output_Pojo = response.as(CityList_Output_Pojo.class);
		ArrayList<CityList> cityList = cityList_Output_Pojo.getData();

		for (CityList eachCityList : cityList) {

			String actCityName = eachCityList.getName();
			if (actCityName.equals("Chennai")) {
				cityId = eachCityList.getId();
				System.out.println("city id " + cityId);

				Assert.assertEquals(actCityName, "Chennai", "verify city name as Ooty");

				break;

			}

		}

	}

	@Test(priority = 4)
	public void addUserAddress() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

		AddUserAddress_Input_Pojo address_Input_Pojo = new AddUserAddress_Input_Pojo("Ramesh", "Velu", "9566164877",
				"Casa Grand", stateIdNum, cityId, 103, "600039", "Chennai", "Home");

		addBody(address_Input_Pojo);

		Response response2 = requestType("POST", "https://omrbranch.com/api/addUserAddress");

		int actStatusCode = getStatusCode(response2);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		AddUserAddress_Output_Pojo addUser = response2.as(AddUserAddress_Output_Pojo.class);

		String actMsg = addUser.getMessage();
		int address_idNum = addUser.getAddress_id();
		address_id = String.valueOf(address_idNum);

		System.out.println("address id " + address_id);
		Assert.assertEquals(actMsg, "Address added successfully", "verify address added success message");
	}

	@Test(priority = 5)
	public void updateUserAddress() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

		UpdateUserAddress_Input_Pojo address_Input_Pojo = new UpdateUserAddress_Input_Pojo(address_id, "Ramesh", "Velu",
				"9566164877", "Casa Grand", stateIdNum, cityId, 103, "600039", "Chennai", "Home");

		addBody(address_Input_Pojo);

		Response response2 = requestType("PUT", "https://omrbranch.com/api/updateUserAddress");

		int actStatusCode = getStatusCode(response2);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		UpdateUserAddress_Output_Pojo updateUserAddress_Output_Pojo = response2.as(UpdateUserAddress_Output_Pojo.class);
		String actMsg = updateUserAddress_Output_Pojo.getMessage();
		System.out.println(actMsg);
		Assert.assertEquals(actMsg, "Address updated successfully", "verify address updated success message");

	}

	@Test(priority = 6)
	public void getUserAddress() {
		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);

		listHeader.add(h1);
		listHeader.add(h2);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

		Response response2 = requestType("GET", "https://omrbranch.com/api/getUserAddress");

		int actStatusCode = getStatusCode(response2);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		GetUserAddress_Output_Pojo getUserAddress_Output_Pojo = response2.as(GetUserAddress_Output_Pojo.class);
		String actMsg = getUserAddress_Output_Pojo.getMessage();
		Assert.assertEquals(actMsg, "OK", "verify get user address message as ok");

	}

	@Test(priority = 7)
	public void deleteuserAddress() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Authorization", "Bearer " + logtoken);
		Header h3 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);
		listHeader.add(h3);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

		DeleteUserAddress_Input_Pojo address_Input_Pojo = new DeleteUserAddress_Input_Pojo(address_id);
		addBody(address_Input_Pojo);

		Response response2 = requestType("DELETE", "https://omrbranch.com/api/deleteAddress");

		int actStatusCode = getStatusCode(response2);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		DeleteUserAddress_Output_Pojo address_Output_Pojo = response2.as(DeleteUserAddress_Output_Pojo.class);

		String actMsg = address_Output_Pojo.getMessage();
		Assert.assertEquals(actMsg, "Address deleted successfully", "verify user address delete message");

	}

	@Test(priority = 8)
	public void searchProduct() {

		List<Header> listHeader = new ArrayList<>();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		listHeader.add(h1);
		listHeader.add(h2);

		Headers headers = new Headers(listHeader);
		addHeaders(headers);

		SearchProduct_Input_Pojo input_Pojo = new SearchProduct_Input_Pojo("nuts");
		addBody(input_Pojo);

		Response response2 = requestType("POST", "https://omrbranch.com/api/searchProduct");

		int actStatusCode = getStatusCode(response2);
		System.out.println(actStatusCode);
		Assert.assertEquals(actStatusCode, 200, "verify status code");

		SearchProduct_Output_Pojo searchProduct_Output_Pojo = response2.as(SearchProduct_Output_Pojo.class);

		String actMessage = searchProduct_Output_Pojo.getMessage();
		Assert.assertEquals(actMessage, "OK", "verify search product OK message");

	}

}
