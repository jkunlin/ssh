package com.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.bean.Article;
import com.bean.Journal;
import com.dao.JournalDAO;

public class JournalDAOImpl implements JournalDAO {

	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Journal> find_all_journal() {
		String hql = "from Journal journal order by journal.journal_id desc";
		return sessionFactory.openSession().createQuery(hql).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> find_all_journal_title() {
		String hql = "select journal_id from Journal journal order by journal.journal_id desc";
		return sessionFactory.openSession().createQuery(hql).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> find_article_of_journal(Integer journal_id) {
		
		String hql = "from Article article where article.journal.journal_id = " + journal_id;
		sessionFactory.openSession().createQuery(hql).list();
		return sessionFactory.openSession().createQuery(hql).list();
		//String hql = "from Article  article where article.journal.journal_id = " + journal_id;
	}

}
