package com.dao;

import java.util.List;
import com.bean.Journal;

public interface JournalDAO {
//	public void save_journal(Journal journal);

//	public void remove_journal(Journal journal);

//	public Journal find_journal_by_id(Integer journal_id);
	

	public List<Journal> find_all_journal();

//	public void update_journal(Journal journal);
}
