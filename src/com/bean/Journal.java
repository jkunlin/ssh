package com.bean;

import java.util.HashSet;
import java.util.Set;

public class Journal {
	private Integer journal_id;
	private Set<Article> articles = new HashSet<Article>();
	
	
	public Integer getJournal_id() {
		return journal_id;
	}
	public void setJournal_id(Integer journal_id) {
		this.journal_id = journal_id;
	}
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	
	
}
