package com.Nvr.Backend.dao;

import java.util.List;

import com.Nvr.Backend.model.User;

public interface UserDAO 
{
	public void insertUser(User user);
	public void deleteUser(String username);
	public List<User> showUser();
}
