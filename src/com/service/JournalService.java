package com.service;

import java.util.List;

import com.bean.Paragraph;

public interface JournalService {
	@SuppressWarnings("rawtypes")
	public List find_all();
	public List<String> find_all_title();
	//no use
	public Integer find_first_journal_id();
	@SuppressWarnings("rawtypes")
	public List find_article_of_journal(Integer journal_id);
	@SuppressWarnings("rawtypes")
	public List find_chapter_of_article(Integer article_id);
	public List<List<Paragraph>> find_paragraph_of_article(Integer chapter_id);
	public void add_journal(String journal_title, String ISSN,List<String> articles_title,
			List<String> articles_outline, List<String> chapters_title);
	public void delete_journal(Integer journal_id);
	public void update_article(Integer article_id, String article_title, String article_outline);
	public void add_paragraph(Integer userid, Integer chapter_id, Integer sequence, String content,
			Double score , Integer score_num);
	public Paragraph find_paragraph_by_paragraph_id(Integer paragraph_id);
	@SuppressWarnings("rawtypes")
	public List find_all_paragraph_of_user(Integer userid);
	public void update_paragraph(Paragraph paragraph);
	public void delete_paragraph(Paragraph paragraph);
}
