package com.action.user;

import java.util.Map;

import com.bean.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class ModifyUserInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6532572051152947101L;
	private UserService service;
	private String username;
	private String old_password;
	private String email;
	private String password;
	private String confirm_password;
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
	public String getOld_password() {
		return old_password;
	}
	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		if (service.checkUser((String)session.get("username"), confirm_password)) {
			addFieldError("message", "旧密码打错了！");
			return INPUT;
		}
		if (service.usernameExsit(username)) {
			addFieldError("message", "用户名早就被人家用了！");
			return INPUT;
		}
		User user = service.find_user_by_userid((Integer)session.get("userid"));
		user.setUsername(username);
		session.put("username", username);
		user.setEmail(email);
		user.setPassword(password);
		service.update(user);
		return SUCCESS;
	}
	
}
