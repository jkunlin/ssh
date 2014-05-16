package com.service;

import java.util.List;

public interface JournalService {
	@SuppressWarnings("rawtypes")
	public List find_all();
	public List<String> find_all_title();
	public Integer find_first_journal_id();
	@SuppressWarnings("rawtypes")
	public List find_article_of_journal(Integer journal_id);
	public void add_journal(String journal_title, List<String> articles_title,
			List<String> articles_outline, List<String> chapters_title);
	public void delete_journal(Integer journal_id);
	public void update_article(Integer article_id, String article_title, String article_outline);
}
