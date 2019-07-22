package com.congthang.service;

import com.congthang.model.User;

public interface UserService {
	public boolean checkLogin(User user);
	public boolean creatUser(User user);
	public boolean checkUserName(String userName);
}
