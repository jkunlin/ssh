package com.action.user;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.UserService;

public class saveNoteAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -556358651302630701L;
	private UserService service;
	private Integer article_id;
	private Integer chapter_id;
	private String note;
	
	public UserService getService() {
		return service;
	}
	public void setService(UserService service) {
		this.service = service;
	}
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}
	public Integer getChapter_id() {
		return chapter_id;
	}
	public void setChapter_id(Integer chapter_id) {
		this.chapter_id = chapter_id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public String execute() throws Exception {
		Map session = ActionContext.getContext().getSession();
		Integer userid = (Integer)session.get("userid");
		if (userid == null) {
			addFieldError("message", "Äú»¹Ä¾ÓÐµÇÂ¼À²£¡");
			return INPUT;
		}
		service.save_note_of_user(userid, note);
		return SUCCESS;
	}
	
}
