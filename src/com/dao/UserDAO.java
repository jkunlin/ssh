package com.dao;

import java.util.List;

import com.bean.User;

public interface UserDAO {
	public void saveUser(User user);

	public void removeUser(User user);

	public User findUserById(Integer id);
	
	public User findUserByUsername(String username);

	public List<User> findAllUsers();

	public void updateUser(User user);


}
