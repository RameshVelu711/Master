package com.payload.address;

import com.pojo.address.AddUserAddress_Input_Pojo;
import com.pojo.address.CityList_Input_Pojo;
import com.pojo.address.DeleteUserAddress_Input_Pojo;
import com.pojo.address.UpdateUserAddress_Input_Pojo;

public class AddressPayload {

	public AddUserAddress_Input_Pojo addUserAddresspayload(String firstName, String lastName, String mobileNo,
			String aparment, int stateId, int cityId, int countryId, String zipcode, String address,
			String addressType) {

		AddUserAddress_Input_Pojo address_Input_Pojo = new AddUserAddress_Input_Pojo(firstName, lastName, mobileNo,
				aparment, stateId, cityId, countryId, zipcode, address, addressType);

		return address_Input_Pojo;

	}

	public UpdateUserAddress_Input_Pojo updateUserAddress(String addressId, String firstName, String lastName,
			String mobileNo, String aparment, int stateId, int cityId, int countryId, String zipcode, String address,
			String addressType) {

		UpdateUserAddress_Input_Pojo address_Input_Pojo = new UpdateUserAddress_Input_Pojo(addressId, firstName,
				lastName, mobileNo, aparment, stateId, cityId, countryId, aparment, addressId, addressType);

		return address_Input_Pojo;

	}

	public CityList_Input_Pojo cityId(String stateId) {

		CityList_Input_Pojo list_Input_Pojo = new CityList_Input_Pojo(stateId);
		return list_Input_Pojo;
	}

	public DeleteUserAddress_Input_Pojo deleteUserAddress(String addressId) {

		DeleteUserAddress_Input_Pojo deleteUserAddress_Input_Pojo = new DeleteUserAddress_Input_Pojo(addressId);

		return deleteUserAddress_Input_Pojo;

	}

}
