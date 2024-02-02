package com.mvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.model.User;

@Repository

public class UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int saveUser(User user) {
			this.hibernateTemplate.setCheckWriteOperations(false);
		int id = (Integer) this.hibernateTemplate.save(user);
		return id;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
