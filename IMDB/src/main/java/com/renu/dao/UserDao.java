package com.renu.dao;

import java.util.List;

import com.renu.pojo.User;
public interface UserDao {
	
	public boolean insert(User u);
	//public boolean delete(User u);
	
	public List<User> getUser();

}
