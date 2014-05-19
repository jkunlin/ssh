package com.action.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6580461564956316441L;
	
	@SuppressWarnings("rawtypes")
	@Override
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		session.remove("username");
		session.remove("userid");
		session.remove("admin");
		return SUCCESS;
	}
}
