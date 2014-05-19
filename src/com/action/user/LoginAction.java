package com.action.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		Boolean[] admin = {false};
		Integer[] userid = {0};
		if (this.service.checkUser(username, password, admin, userid)) {
			Map session = ActionContext.getContext().getSession();
			session.put("username", username);
			session.put("userid", userid[0]);
			session.put("admin", admin[0]);
			return SUCCESS;
		}
		else {
			addFieldError("message", "用户名或密码错误");
			return INPUT;
		}
	}
}
