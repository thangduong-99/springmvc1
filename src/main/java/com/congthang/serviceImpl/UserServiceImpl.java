package com.congthang.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.congthang.model.User;
import com.congthang.service.UserService;

public class UserServiceImpl implements UserService {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	private JdbcTemplate jdbcTemplateObject;

	Connection conn = null;
	PreparedStatement stm = null;
	public boolean checkLogin(User user) {
		String query = "SELECT * FROM user WHERE username=? AND password=?";

		try {
			conn=dataSource.getConnection();
			stm = conn.prepareStatement(query);

			stm.setString(1, user.getUserName());
			stm.setString(2, user.getPassWord());

			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				return true;
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean creatUser(User user) {
		String sql = "INSERT INTO user " + "(username, password) VALUES (?, ?)";
		jdbcTemplateObject = new JdbcTemplate(dataSource);
		if(checkUserName(user.getUserName())) {
			return false;
		}else {
			jdbcTemplateObject.update(sql, new Object[] { user.getUserName(), user.getPassWord()});
			return true;
		}
		
	}

	public boolean checkUserName(String userName) {
		String query = "SELECT * FROM user WHERE username=?";
		try {
			conn=dataSource.getConnection();
			stm = conn.prepareStatement(query);

			stm.setString(1, userName);

			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				return true;
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
