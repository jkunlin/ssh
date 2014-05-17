package com.service.impl;

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


	public void save(User user)
	{
		this.userDao.saveUser(user);
	}

	public void update(User user)
	{
		this.userDao.updateUser(user);
	}
	
	public boolean checkUser(String username, String password, Boolean[] admin){
		User user = this.userDao.findUserByUsername(username);
		admin[0] = user.getAdmin();
		if (user.getPassword() != null && user.getPassword().equals(password)) {
			return true;
		}
		else
			return false;
	}

	@Override
	public void save_note_of_user(String username, String note) {
		User user = this.userDao.findUserByUsername(username);
		user.setNote(note);
		this.userDao.updateUser(user);
	}

	@Override
	public String find_note_of_user(String username) {
		return this.userDao.find_note_of_user(username);
	}

}
