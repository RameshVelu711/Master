package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlByAddThrows {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String password = "admin";
		Connection connection = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		connection = DriverManager.getConnection(url, userName, password);

		String sql = "SELECT * FROM ADACTIN_HOTEL WHERE TESTCASE_NO=2";

		PreparedStatement statement = connection.prepareStatement(sql);

		ResultSet rs = statement.executeQuery();

		while (rs.next()) {
			String tcNo = rs.getString("TESTCASE_NO");
			System.out.println(tcNo);
			String user = rs.getString("USERNAME");
			System.out.println(user);
			String pass = rs.getString("PASSWORD");
			System.out.println(pass);
			String loc = rs.getString("LOCATION");
			System.out.println(loc);
			String hot = rs.getString("HOTELS");
			System.out.println(hot);
			String rt = rs.getString("ROOM_TYPE");
			System.out.println(rt);
			String cin = rs.getString("CHECKIN_IN_DATE");
			System.out.println(cin);
			String co = rs.getString("CHECK_OUT_DATE");
			System.out.println(co);
			String ad = rs.getString("ADULTS_PER_ROOM");
			System.out.println(ad);
			String ch = rs.getString("CHILDREN_PER_ROOM");
			System.out.println(ch);
			String first = rs.getString("FIRSTNAME");
			System.out.println(first);
			String last = rs.getString("LASTNAME");
			System.out.println(last);
			String bill = rs.getString("BILLING_ADDRESS");
			System.out.println(bill);
			String cc = rs.getString("CREDIT_CARD_NO");
			System.out.println(cc);
			String cct = rs.getString("CREDIT_CARD_TYPE");
			System.out.println(cct);
			String month = rs.getString("MONTH");
			System.out.println(month);
			String year = rs.getString("YEAR");
			System.out.println(year);
			String cvv = rs.getString("CVV");
			System.out.println(cvv);

		}

		connection.close();

	}
}
