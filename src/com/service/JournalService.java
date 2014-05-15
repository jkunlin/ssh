package com.service;

import java.util.List;

public interface JournalService {
	@SuppressWarnings("rawtypes")
	public List find_all();
	public List<String> find_all_title();
	public Integer find_first_journal_id();
	@SuppressWarnings("rawtypes")
	public List find_article_of_journal(Integer journal_id);
}
