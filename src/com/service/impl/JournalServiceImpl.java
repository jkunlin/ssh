package com.service.impl;

import java.util.List;
import java.util.Set;

import com.bean.Article;
import com.bean.Journal;
import com.dao.JournalDAO;
import com.service.JournalService;

public class JournalServiceImpl implements JournalService {
	private JournalDAO journalDAO;
	
	public void setJournalDAO(JournalDAO journalDAO) {
		this.journalDAO = journalDAO;
	}

	@Override
	public List<Journal> find_all() {
		return journalDAO.find_all_journal();
	}

	@Override
	public List<String> find_all_title() {
		return journalDAO.find_all_journal_title();
	}

	@Override
	public Set<Article> find_article_of_journal(Integer journal_id) {
		return journalDAO.find_article_of_journal(journal_id);
	}

}
