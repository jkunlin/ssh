package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.bean.User;
import com.dao.UserDAO;

public class UserDAOImpl implements UserDAO {
	
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	@SuppressWarnings("rawtypes")
	public User findUserByUsername(String username){
		
		Session session = sessionFactory.openSession();
		String hql = "from User user where user.username = '" + username + "'";
		Query query = session.createQuery(hql);
		List list = query.list();
		session.close();
		if (list.isEmpty()) {
			return  null;
		}
		else {
			return (User)list.get(0);
		}
	}

	public void saveUser(User user)
	{
		Session session = sessionFactory.openSession();
		session.save(user);
		session.flush();
		session.close();
	}

	public void updateUser(User user)
	{
		Session session = sessionFactory.openSession();
		session.update(user);
		session.flush();
		session.close();
	}

	@Override
	public String find_note_of_user(Integer userid) {
		Session session = sessionFactory.openSession();
		String hql = "select note from User user where userid = " + userid;
		Query query = session.createQuery(hql);
		String res = (String)query.uniqueResult();
		session.close();
		return res;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public User findUserByUserid(Integer userid) {
		Session session = sessionFactory.openSession();
		String hql = "from User user where user.userid = '" + userid + "'";
		Query query = session.createQuery(hql);
		List list = query.list();
		session.close();
		if (list.isEmpty()) {
			return  null;
		}
		else {
			return (User)list.get(0);
		}
	}
}
