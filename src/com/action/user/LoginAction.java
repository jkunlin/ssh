package com.action.user;

import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1306001442671662897L;
	private String username;
	private String password;
	private UserService service;
	
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setService(UserService service) {
		this.service = service;
	}
	
	@Override
	public String execute() throws Exception {
		if (this.service.checkUser(username, password))
			return SUCCESS;
		else
			return INPUT;
	}
}
