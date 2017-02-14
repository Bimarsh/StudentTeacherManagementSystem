package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.modal.User;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	DataSource datasource;

	/*Connection conn = null;*/
	ResultSet res = null;
	PreparedStatement ps = null;
	/*String user = "root";
	String password = "";
	String url = "jdbc:mysql://localhost:3306/ittraining";*/

	
	@Override
	public User login(User user) {
		if(datasource==null)
		{
			System.out.println("is null");
		}
		else
		{
			System.out.println("datasoruce: "+datasource.toString());
		}
		User user1 = new User();
		String query = "select * from user where username=? and password=?";
		try {
			ps = datasource.getConnection().prepareStatement(query);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			res = ps.executeQuery();
			while (res.next()) {
				user1.setUsername(res.getString("username"));
				user1.setRole(res.getString("role"));
				user1.setValid(true);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user1;
	}

}
