package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Article;
import com.bean.Chapter;
import com.dao.JournalDAO;

public class JournalDAOImpl implements JournalDAO {

	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings({ "rawtypes" })
	@Override
	public List find_all_journal() {
		Session session = sessionFactory.openSession();
		String hql = "select journal.journal_id, journal.journal_title from Journal journal";
		List res = session.createQuery(hql).list();
		session.close();
		return res;
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> find_all_journal_title() {
		Session session = sessionFactory.openSession();
		String hql = "select journal_title from Journal journal order by journal.journal_id desc";
		List<String> res = session.createQuery(hql).list();
		session.close();
		return res;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List find_article_of_journal(Integer journal_id) {
		Session session = sessionFactory.openSession();
		String hql = "select article_id, title, outline from Article article where article.journal.journal_id = " + journal_id;
		List<Article> res = session.createQuery(hql).list();
		session.close();
		return res;
		//String hql = "from Article  article where article.journal.journal_id = " + journal_id;
	}

	@Override
	public Integer find_first_journal_id() {
		Session session = sessionFactory.openSession();
		String hql = "select journal_id from Journal journal";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(1);
		Integer res = (Integer)query.list().get(0);
		return res;
	}

	@Override
	public void add_chapter(Chapter chapter) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.save(chapter);
		session.close();
	}

}
