package com.service;

import java.util.List;
import java.util.Set;

import com.bean.Article;
import com.bean.Journal;

public interface JournalService {
	public List<Journal> find_all();
	public List<String> find_all_title();
	public Set<Article> find_article_of_journal(Integer journal_id);
}
