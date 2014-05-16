package com.bean;

import java.util.HashSet;
import java.util.Set;

public class Chapter {
	private Article article;
	private Integer chapter_id;
	private String title;
	private Integer sequence;
	private Set<Paragraph> paragraphs = new HashSet<Paragraph>();
	
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
	public Integer getChapter_id() {
		return chapter_id;
	}
	public void setChapter_id(Integer chapter_id) {
		this.chapter_id = chapter_id;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public Set<Paragraph> getParagraphs() {
		return paragraphs;
	}
	public void setParagraphs(Set<Paragraph> paragraphs) {
		this.paragraphs = paragraphs;
	}
	
	
}
