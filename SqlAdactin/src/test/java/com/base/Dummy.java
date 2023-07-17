package com.base;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class Dummy {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:oracle:thin:@Localhost:1521:xe";
		String userName = "hr";
		String pass = "admin";
		Connection connection = null;

		Class.forName("oracle.jdbc.driver.OracleDriver");

		 connection = DriverManager.getConnection(url,userName,pass);
		
		PreparedStatement ps = connection.prepareStatement("select * from adactin_hotel where testcase_no=1");
		ResultSet query = ps.executeQuery();
		
		query.next();
		String string = query.getString("testcase_no");
		System.out.println(string);
		String string1 = query.getString("username");
		System.out.println(string1);
		
		
		connection.close();
		System.out.println("connection closed");
		
		
		
		
		
		
		
	}
}
