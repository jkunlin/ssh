package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.Chapter;
import com.bean.Paragraph;
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
		String hql = "select journal.journal_id, journal.journal_title, journal.ISSN from Journal journal order by journal.journal_id desc";
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

	@SuppressWarnings({ "rawtypes" })
	@Override
	public List find_article_of_journal(Integer journal_id) {
		Session session = sessionFactory.openSession();
		String hql = "select article_id, title, outline from Article article where article.journal.journal_id = " + journal_id;
		List res = session.createQuery(hql).list();
		session.close();
		return res;
		//String hql = "from Article  article where article.journal.journal_id = " + journal_id;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List find_chapter_of_article(Integer article_id) {
		Session session = sessionFactory.openSession();
		String hql = "select chapter_id, title from Chapter chapter where article_id = " + article_id + " order by sequence";
		List res = session.createQuery(hql).list();
		session.close();
		return res;
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<List<Paragraph>> find_paragraph_of_chapter(Integer chapter_id) {
		Session session = sessionFactory.openSession();
		List<List<Paragraph>> res = new ArrayList<List<Paragraph>>();
		String hql = "select max(sequence) from Paragraph paragraph where chapter_id = " + chapter_id;
		Query query = session.createQuery(hql);
		Integer max_sequence = (Integer)query.uniqueResult();
		if (max_sequence == null) {
			session.close();
			return null;
		}
		
		
		for (int i = 0; i <= max_sequence; ++i) {
			hql = "from Paragraph paragraph where chapter_id = :chapter_id and sequence = :sequence";
			query = session.createQuery(hql);
			query.setInteger("chapter_id", chapter_id);
			query.setInteger("sequence", i);
			query.setFirstResult(0);
			query.setMaxResults(5);
			res.add(query.list());
		}
		session.close();
		return res;
	}
	
	@Override
	public Integer find_first_journal_id() {
		Session session = sessionFactory.openSession();
		String hql = "select journal_id from Journal journal order by journal.journal_id desc";
		Query query = session.createQuery(hql);
		query.setFirstResult(0);
		query.setMaxResults(1);
		Integer res = (Integer)query.list().get(0);
		session.close();
		return res;
	}

	@Override
	public void add_chapter(Chapter chapter) {
		Session session = sessionFactory.openSession();
		session.save(chapter);
		session.close();
	}

	@Override
	public void delete_journal(Integer journal_id) {
		Session session = sessionFactory.openSession();
		String hql = "delete from Journal journal where journal_id = " + journal_id;
		Query query = session.createQuery(hql);
		query.executeUpdate();
		session.close();
	}

	@Override
	public void update_article(Integer article_id, String article_title,
			String article_outline) {
		Session session = sessionFactory.openSession();
		String hql = "update Article article set article.title = :article_title, article.outline = :article_outline where article.article_id = :article_id";
		Query query = session.createQuery(hql);
		query.setString("article_title", article_title);
		query.setString("article_outline", article_outline);
		query.setInteger("article_id", article_id);
		query.executeUpdate();
		session.close();
	}

	@Override
	public void add_paragraph(Paragraph paragraph) {
		Session session = sessionFactory.openSession();
		session.save(paragraph);
		session.close();
		
	}

	

	

}
