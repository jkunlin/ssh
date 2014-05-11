package com.service.impl;

import java.util.List;

import com.bean.User;
import com.dao.UserDAO;
import com.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDAO userDao;

	public UserDAO getUserDao()
	{
		return userDao;
	}

	public void setUserDao(UserDAO userDao)
	{
		this.userDao = userDao;
	}

	public void delete(User user)
	{
		this.userDao.removeUser(user);
	}

	public List<User> findAll()
	{
		return this.userDao.findAllUsers();
	}

	public User findById(Integer id)
	{
		return this.userDao.findUserById(id);
	}

	public void save(User user)
	{
		this.userDao.saveUser(user);
	}

	public void update(User user)
	{
		this.userDao.updateUser(user);
	}
	
	public boolean checkUser(String username, String password){
		User user = this.userDao.findUserByUsername(username);
		if (user.getPassword() != null && user.getPassword().equals(password)) {
			return true;
		}
		else
			return false;
	}

}
