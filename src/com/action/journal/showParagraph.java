package com.action.journal;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.service.JournalService;

@SuppressWarnings("serial")
public class showParagraph extends ActionSupport {
	private JournalService service;
	private Integer paragraph_id;
	private String journal_title;
	private String article_title;
	private String chapter_title;
	private Integer sequence;
	
	
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public String getJournal_title() {
		return journal_title;
	}
	public void setJournal_title(String journal_title) {
		this.journal_title = journal_title;
	}
	
	public String getArticle_title() {
		return article_title;
	}
	public void setArticle_title(String article_title) {
		this.article_title = article_title;
	}
	public String getChapter_title() {
		return chapter_title;
	}
	public void setChapter_title(String chapter_title) {
		this.chapter_title = chapter_title;
	}
	public JournalService getService() {
		return service;
	}
	public void setService(JournalService service) {
		this.service = service;
	}
	public Integer getParagraph_id() {
		return paragraph_id;
	}
	public void setParagraph_id(Integer paragraph_id) {
		this.paragraph_id = paragraph_id;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public String execute() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");
		request.put("paragraph", service.find_paragraph_by_paragraph_id(paragraph_id));
		return SUCCESS;
	}
	
}
