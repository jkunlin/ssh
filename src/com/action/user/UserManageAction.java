package com.action.user;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.service.JournalService;
import com.service.UserService;

public class UserManageAction implements Action{
	/**
	 * 
	 */
	//private static final long serialVersionUID = 5079669184649157202L;
	private JournalService journalService;
	private UserService userService;
	public JournalService getJournalService() {
		return journalService;
	}
	public void setJournalService(JournalService journalService) {
		this.journalService = journalService;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		Map session = (Map) ActionContext.getContext().get("session");
		Map request = (Map) ActionContext.getContext().get("request");
		Integer userid = (Integer)session.get("userid");
		request.put("note", userService.find_note_of_user(userid));
		request.put("user", userService.find_user_by_userid(userid));
		request.put("paragraphs", journalService.find_all_paragraph_of_user(userid));
		return SUCCESS;
	}
}
