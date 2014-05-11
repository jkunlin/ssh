package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.bean.User;
import com.dao.UserDAO;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	@SuppressWarnings("unchecked")
	public List<User> findAllUsers()
	{
		String hql = "from User user order by user.id desc";
		return (List<User>)this.getHibernateTemplate().find(hql);
	}

	public User findUserById(Integer id)
	{
		User user = (User) this.getHibernateTemplate().get(User.class, id);
		return user;
	}

	@SuppressWarnings("rawtypes")
	public User findUserByUsername(String username){
		User user = new User();
		user.setUsername(username);
		List list = this.getHibernateTemplate().findByExample(user);
		if (list.isEmpty()) {
			user.setPassword(null);
			return user;
		}
		else {
			return (User)list.get(0);
		}
	}
	public void removeUser(User user)
	{
		this.getHibernateTemplate().delete(user);
	}

	public void saveUser(User user)
	{
		this.getHibernateTemplate().save(user);
	}

	public void updateUser(User user)
	{
		this.getHibernateTemplate().update(user);
	}
}
