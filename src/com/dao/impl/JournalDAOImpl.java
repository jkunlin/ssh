package com.dao.impl;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.bean.Article;
import com.bean.Journal;
import com.dao.JournalDAO;

public class JournalDAOImpl extends HibernateDaoSupport implements JournalDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<Journal> find_all_journal() {
		String hql = "from Journal journal order by journal.journal_id desc";
		return (List<Journal>)this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> find_all_journal_title() {
		String hql = "select journal_id from Journal journal order by journal.journal_id desc";
		return (List<String>)this.getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Set<Article> find_article_of_journal(Integer journal_id) {
		
		String hql = "from Article article left join article.journal journal";
		
		this.getHibernateTemplate().find(hql);
		Set<Article> articles = ((List<Journal>)this.getHibernateTemplate().find(hql)).get(0).getArticles();
		//String hql = "from Article  article where article.journal.journal_id = " + journal_id;
		return articles;
	}

}
