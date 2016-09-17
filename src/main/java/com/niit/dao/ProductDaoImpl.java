package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Products;
import com.niit.model.Roles;
import com.niit.model.UserBean;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
@Autowired(required=true)
private SessionFactory session;
	
	@Override
	public void add(Products products) {
		session.getCurrentSession().save(products);
	}

	@Override
	public void edit(Products products) {
		session.getCurrentSession().update(products);
		
	}

	@Override
	public void delete(String getId) {
		session.getCurrentSession().delete(getProducts(getId));
	}

	@Override
	public Products getProducts(String getId) {
		return (Products)session.getCurrentSession().get(Products.class,getId);
	}

	@Override
	public List getAllProducts() {
		return session.getCurrentSession().createQuery("from Products").list();
	}
		@Override
		public List getAllBabyPowders() {
			return session.getCurrentSession().createQuery("from PRODUCT where category='BabyPowders'").list();
		}

		@Override
		public List getAllBabyOil() {
			return session.getCurrentSession().createQuery("from PRODUCT where category='BabyOil'").list();
		}

		@Override
		public List getAllShampoos() {
			return session.getCurrentSession().createQuery("from PRODUCT where category='Shampoos'").list();
		}

		@Override
		public List getAllBabySoap() {
			return session.getCurrentSession().createQuery("from PRODUCT where category='BabySoap'").list();
		}

		@Override
		public List getAllBabyLotion(){
			return session.getCurrentSession().createQuery("from PRODUCT where category='BabyLotion'").list();
		}

		@Override
		public void s(UserBean userBean) {
			// TODO Auto-generated method stub
			Roles r=new Roles();
			r.setRolename("ROLE_USER");
			r.setU(userBean);
			session.getCurrentSession().saveOrUpdate(userBean);
			session.getCurrentSession().saveOrUpdate(r);
		}

	

	}
	


