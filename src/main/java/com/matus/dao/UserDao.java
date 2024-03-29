package com.matus.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDao {

	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_jsp_java",
					"root", "12345678");
		}catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
