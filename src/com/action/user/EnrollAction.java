package com.action.user;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class EnrollAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1157982901685956940L;
	private UserService service;
	private String username;
	private String password;
	private String confirm_password;
	private String email;
	
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public String execute() throws Exception {
		if (service.usernameExsit(username)) {
			addFieldError("message", "用户名早就被人家用了！");
			return INPUT;
		}
		User user = new User();
		user.setAdmin(false);
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		service.save(user);
		Map session = ActionContext.getContext().getSession();
		session.put("username", username);
		session.put("userid", user.getUserid());
		session.put("admin", 0);
		return SUCCESS;
	}
}
