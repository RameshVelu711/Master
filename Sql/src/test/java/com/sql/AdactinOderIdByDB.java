package com.sql;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.base.BaseClass;
import com.pages.TC4_Book_Hotel;
import com.pages.TC5_Booking_Confirmation;
import com.pages.TC6_Booking_cancel;
import com.pages.TC1_Login_page;
import com.pages.TC2_Search_Hotel;
import com.pages.TC3_Select_Hotel;

public class AdactinOderIdByDB extends BaseClass {
	@Before
	public void beforeTest() {

		getDriver("chrome");
		enterAppUrl("https://adactinhotelapp.com/index.php");

	}

	@Test
	public void test() throws ClassNotFoundException, SQLException {

		Adactin value = dataBaseValue();

		TC1_Login_page lG = new TC1_Login_page();

		lG.login(value.getUser(), value.getPass());
		TC2_Search_Hotel sh = new TC2_Search_Hotel();

		sh.SelectHotel1(value.getLoc(), value.getHot(), value.getRt(), value.getNoofroom(), value.getCin(),
				value.getCo(), value.getAd(), value.getCh());

		TC3_Select_Hotel s = new TC3_Select_Hotel();
		s.searchHotel();

		TC4_Book_Hotel b = new TC4_Book_Hotel();
		b.bookHotelPage(value.getFirst(), value.getLast(), value.getBill(), value.getCc(), value.getCct(),
				value.getMonth(), value.getYear(), value.getCvv());

		TC5_Booking_Confirmation bC = new TC5_Booking_Confirmation();
		String orderId = bC.getOrderId();
		System.out.println(orderId);

		TC6_Booking_cancel bc = new TC6_Booking_cancel();
		bc.CancelBooking(orderId);
	}

	@After
	public void afterTest() {
		 quitWindow();
	}

}
