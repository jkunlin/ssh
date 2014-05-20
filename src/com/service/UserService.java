package com.service;

import com.bean.User;

public interface UserService {

	public void save(User user);

	public void update(User user);
	
	public User find_user_by_userid(Integer userid);
	
	public boolean checkUser(String username, String password);
	
	public boolean checkUser(String username, String password, Boolean[] admin, Integer[] userid);

	public void save_note_of_user(Integer userid, String note);
	
	public String find_note_of_user(Integer userid);
	
	public boolean usernameExsit(String username);
}
