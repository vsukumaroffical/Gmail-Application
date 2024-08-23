package com.gmail.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServiceUtil {


	private static String url = "jdbc:mysql://localhost:3306/GmailDB";//jdbc:mysql://localhost:3306/GmailDB

	private static String userName = "sukumar";
	private static String password = "your_password";

	protected static Connection getGmailDBConnection() throws SQLException {
		return DriverManager.getConnection(url, userName, password);
	}

}
