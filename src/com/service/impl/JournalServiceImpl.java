package com.service.impl;

import java.util.List;

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

}
