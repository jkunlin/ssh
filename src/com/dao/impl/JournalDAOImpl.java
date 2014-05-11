package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.bean.Journal;
import com.dao.JournalDAO;

public class JournalDAOImpl extends HibernateDaoSupport implements JournalDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Journal> find_all_journal() {
		String hql = "from Journal journal order by journal.journal_id desc";
		return (List<Journal>)this.getHibernateTemplate().find(hql);
	}

}
