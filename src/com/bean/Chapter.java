package com.bean;

public class Chapter {
	private Article article;
	private Integer chapter_id;
	private String title;
	private Integer sequence;
	
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
	
	
}
