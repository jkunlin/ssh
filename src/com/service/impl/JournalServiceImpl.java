package com.service.impl;

import java.util.List;

import com.dao.JournalDAO;
import com.service.JournalService;

public class JournalServiceImpl implements JournalService {
	private JournalDAO journalDAO;
	
	public void setJournalDAO(JournalDAO journalDAO) {
		this.journalDAO = journalDAO;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List find_all() {
		return journalDAO.find_all_journal();
	}
	
	
	@Override
	public List<String> find_all_title() {
		return journalDAO.find_all_journal_title();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List find_article_of_journal(Integer journal_id) {
		return journalDAO.find_article_of_journal(journal_id);
	}

	@Override
	public Integer find_first_journal_id() {
		return journalDAO.find_first_journal_id();
	}

	

}
