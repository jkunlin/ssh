package com.service;

import java.util.List;

import com.bean.User;

public interface UserService {
	public List<User> findAll();

	public void save(User user);

	public void delete(User user);

	public User findById(Integer id);

	public void update(User user);
	
	public boolean checkUser(String username, String password);

}
