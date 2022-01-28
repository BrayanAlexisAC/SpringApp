package com.springApp.daos;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springApp.objects.dataBase.Users;
import com.springApp.objects.dataBase.classId.UsersId;

@Component
public class UsersDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public Users getUserByName(String userName) {
		Session session = sessionFactory.getCurrentSession();
		Users user  = session.createQuery("FROM SEC_USERS WHERE USER_NAME = '" + userName + "'", Users.class).getSingleResult();
		
		return user;
	}
	
	@Transactional
	public Users getUserByIds(Integer uderId, String userNAme) {
		Session session = sessionFactory.getCurrentSession();;
		Users user = session.get(Users.class, new UsersId(0, userNAme));
		return user;
	}
	
}
