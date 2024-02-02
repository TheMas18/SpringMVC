package com.mvc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.dao.UserDao;
import com.mvc.model.User;
@EnableTransactionManagement
@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
