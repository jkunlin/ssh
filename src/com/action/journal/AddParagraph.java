package com.action.journal;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class AddParagraph extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1412937526228083030L;
	private JournalService service;
	private Integer article_id;
	private Integer chapter_id;
	private Integer sequence;
	private String content;
	private Integer user_id;
	
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

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String execute() throws Exception {
		System.out.println(article_id);
		System.out.println(chapter_id);
		return SUCCESS;
	}
}
