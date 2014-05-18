package com.action.journal;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

public class AddJournalAction extends ActionSupport {

	/**
	 * 
	 */
	private String journal_title;
	private String ISSN;
	private List<String> articles_title;
	private List<String> articles_outline;
	private List<String> chapters_title;
	private JournalService service;
	private static final long serialVersionUID = 2565105044761503064L;

	
	
	public String getISSN() {
		return ISSN;
	}



	public void setISSN(String iSSN) {
		ISSN = iSSN;
	}



	public String getJournal_title() {
		return journal_title;
	}



	public void setJournal_title(String journal_title) {
		this.journal_title = journal_title;
	}



	public List<String> getArticles_title() {
		return articles_title;
	}



	public void setArticles_title(List<String> articles_title) {
		this.articles_title = articles_title;
	}



	public List<String> getArticles_outline() {
		return articles_outline;
	}



	public void setArticles_outline(List<String> articles_outline) {
		this.articles_outline = articles_outline;
	}



	public List<String> getChapters_title() {
		return chapters_title;
	}



	public void setChapters_title(List<String> chapters_title) {
		this.chapters_title = chapters_title;
	}



	public JournalService getService() {
		return service;
	}



	public void setService(JournalService service) {
		this.service = service;
	}



	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		service.add_journal(journal_title, ISSN, articles_title, articles_outline, chapters_title);
		return SUCCESS;
	}
}
