package com.service;

import com.bean.User;

public interface UserService {

	public void save(User user);

	public void update(User user);
	
	public boolean checkUser(String username, String password, Boolean[] admin);

	public void save_note_of_user(String username, String note);
	
	public String find_note_of_user(String username);
}
