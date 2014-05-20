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
	
	@Override
	public boolean checkUser(String username, String password) {
		User user = this.userDao.findUserByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			return true;
		}
		else
			return false;
	}
	
	public boolean checkUser(String username, String password, Boolean[] admin, Integer[] userid){
		User user = this.userDao.findUserByUsername(username);
		if (user != null && user.getPassword().equals(password)) {
			admin[0] = user.getAdmin();
			userid[0] = user.getUserid();
			return true;
		}
		else
			return false;
	}

	@Override
	public void save_note_of_user(Integer userid, String note) {
		User user = this.userDao.findUserByUserid(userid);
		user.setNote(note);
		this.userDao.updateUser(user);
	}

	@Override
	public String find_note_of_user(Integer userid) {
		return this.userDao.find_note_of_user(userid);
	}

	@Override
	public boolean usernameExsit(String username) {
		User user = this.userDao.findUserByUsername(username);
		if (user == null ) {
			return false;
		}
		return true;
	}

	@Override
	public User find_user_by_userid(Integer userid) {
		return this.userDao.findUserByUserid(userid);
	}

	

}
