package com.matus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.matus.bean.User;
import com.mysql.jdbc.PreparedStatement;

public class UserDao {

	public static Connection getConnection() {
		Connection con = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud_jsp_java", "root", "12345678");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static List<User> getAllUser() {
		List<User> listUser = new ArrayList<User>();

		try {
			Connection con = getConnection();
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("SELECT * FROM usuario");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setId(rs.getLong("id"));
				user.setName(rs.getString("nome"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setSexo(rs.getString("Sexo"));
				user.setPais(rs.getString("pais"));

				listUser.add(user);
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return listUser;
	}
}
