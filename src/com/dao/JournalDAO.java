package com.dao;

import java.util.List;

import com.bean.Chapter;
import com.bean.Paragraph;

public interface JournalDAO {
//	public void save_journal(Journal journal);

//	public void remove_journal(Journal journal);

//	public Journal find_journal_by_id(Integer journal_id);
	
	public List<String> find_all_journal_title();
	
	@SuppressWarnings("rawtypes")
	public List find_all_journal();
	
	@SuppressWarnings("rawtypes")
	public List find_article_of_journal(Integer journal_id);

	@SuppressWarnings("rawtypes")
	public List find_chapter_of_article(Integer article_id);
	
	public List<List<Paragraph>> find_paragraph_of_chapter(Integer chapter_id);
	
	//no use
	public Integer find_first_journal_id();
	
	public void add_chapter(Chapter chapter);
	
	public void delete_journal(Integer journal_id);
	
	public void update_article(Integer article_id, String article_title, String article_outline);

	public void add_paragraph(Paragraph paragraph);
	
	//journal_title, chapter_title, sequence of paragraph, paragraph_id
	@SuppressWarnings("rawtypes")
	public List find_all_paragraph_of_user(Integer userid);
	
	public Paragraph find_paragraph_by_paragraph_id(Integer paragraph_id);
	
	public void update_paragraph(Paragraph paragraph);
	
	public void delete_paragraph(Paragraph paragraph);
//	public void update_journal(Journal journal);
}
