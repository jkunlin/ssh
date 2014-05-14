package com.bean;

public class Article {
	private Journal journal;
	private Integer article_id;
	private String title;
	private String outline;
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOutline() {
		return outline;
	}
	public void setOutline(String outline) {
		this.outline = outline;
	}
	public Journal getJournal() {
		return journal;
	}
	public void setJournal(Journal journal) {
		this.journal = journal;
	}
	public Integer getArticle_id() {
		return article_id;
	}
	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}
	
}
