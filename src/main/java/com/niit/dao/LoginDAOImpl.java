/*package com.niit.dao;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Get;

	@Repository
	@Transactional
	public class LoginDAOImpl implements Logindao {

		@Autowired(required=true)
		private SessionFactory sf;
		@Override
		public boolean checkUser(Get u) {
			boolean isvaliduser=false;
			
			Query q=sf.openSession().createQuery("from User where name= '"+u.getName()+"' and password='"+u.getPassword()+"'");
			List<Get> lu=q.list();
			int s=lu.size();
			if(s==1)
			{
				isvaliduser=true;
			}
			
			return isvaliduser;
		}
	}
*/
