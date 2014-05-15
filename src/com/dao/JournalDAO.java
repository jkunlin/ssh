package com.dao;

import java.util.List;

public interface JournalDAO {
//	public void save_journal(Journal journal);

//	public void remove_journal(Journal journal);

//	public Journal find_journal_by_id(Integer journal_id);
	
	public List<String> find_all_journal_title();
	
	@SuppressWarnings("rawtypes")
	public List find_all_journal();
	
	@SuppressWarnings("rawtypes")
	public List find_article_of_journal(Integer journal_id);
	
	public Integer find_first_journal_id();
	

//	public void update_journal(Journal journal);
}
