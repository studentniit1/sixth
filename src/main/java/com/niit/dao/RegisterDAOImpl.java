/*package com.niit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;


	@Repository
	@Transactional
	public class RegisterDAOImpl implements RegisterDAO{
		

		@Autowired
		private SessionFactory sf;
		

			public void ob(User t){
			sf.getCurrentSession().saveOrUpdate(t);
		}
	}*/