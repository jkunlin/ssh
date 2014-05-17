package com.action.journal;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class EditJournalAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5284601375402368075L;
	private JournalService service;
	private Integer journal_id;
	private Integer article_id;
	private String article_title;
	private String article_outline;
	
	
	public Integer getJournal_id() {
		return journal_id;
	}
	public void setJournal_id(Integer journal_id) {
		this.journal_id = journal_id;
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
	public String getArticle_title() {
		return article_title;
	}
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}
	public String getArticle_outline() {
		return article_outline;
	}
	public void setArticle_outline(String article_outline) {
		this.article_outline = article_outline;
	}
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		service.update_article(article_id, article_title, article_outline);
		return SUCCESS;
	}
}
