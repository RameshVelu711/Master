package com.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlByTryCatch {
	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userName = "hr";
		String password = "admin";
		Connection connection = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			connection = DriverManager.getConnection(url, userName, password);

			// 3,Write a SQL query
			String sql = "SELECT * FROM ADACTIN_HOTEL WHERE TESTCASE_NO=1";

			// 4. prepare the statement
			PreparedStatement ps = connection.prepareStatement(sql);

			// 5.Execute query
			ResultSet rs = ps.executeQuery();

			// 6.Iterate the result
			while (rs.next()) {

				String firstNameColumn = rs.getString("FIRSTNAME");
				System.out.println(firstNameColumn);

			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		finally {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}

}
