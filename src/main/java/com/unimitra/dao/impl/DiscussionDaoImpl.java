package com.unimitra.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unimitra.dao.DiscussionDao;
import com.unimitra.entity.QuestionsEntity;

@Repository
public class DiscussionDaoImpl implements DiscussionDao {

	SessionFactory sessionFactory;

	@Override
	public String postQuestions(QuestionsEntity questionEntity) {
		Session session = sessionFactory.getCurrentSession();
		session.save(questionEntity);
		return "Successful";
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
