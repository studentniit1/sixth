package com.niit.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.model.Cart;
import com.niit.model.UserBean;

@Repository
public class CartdaoImpl implements Cartdao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void add(Cart cart,String uname) {
		//System.out.println("cartdaio impl");
		
		System.out.println(cart.getProducts());
		
		List<UserBean> u=sessionFactory.getCurrentSession().createQuery("from UserBean where uname='"+uname+"'").list();
		for(int i=0;i<u.size();i++)
		{
		UserBean r=(UserBean) u.get(i);
		r.setCart(cart);
		}
		sessionFactory.getCurrentSession().save(cart);
		//sessionFactory.getCurrentSession().update(r);
	}

	@Override
	public List getAllProducts() {	
		System.out.println("cart");
		
		return  sessionFactory.getCurrentSession().createQuery("from Cart ").list();
		
	}

}
