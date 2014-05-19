package com.action.journal;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;
import com.service.UserService;

public class ShowArticleAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1205480114189063557L;
	private JournalService service;
	private UserService userService;
	private Integer article_id;
	private Integer chapter_id;
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public JournalService getService() {
		return service;
	}
	public void setService(JournalService service) {
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		Map request = (Map) ActionContext.getContext().get("request");
		List chapter_list = service.find_chapter_of_article(article_id);
		request.put("chapter_list", chapter_list);
		
		if(chapter_id == null) {
			chapter_id = (Integer)((Object[])chapter_list.get(0))[0];
		}
		request.put("paragraph_list", service.find_paragraph_of_article(chapter_id));
		Map session = (Map) ActionContext.getContext().get("session");
		request.put("note", userService.find_note_of_user((Integer)session.get("userid")));
		return SUCCESS;
	}
	
}
