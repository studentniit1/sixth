package com.niit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.dao.Cartdao;
import com.niit.model.Cart;
@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private Cartdao cartdao;
	
	@Transactional
	public void add(Cart cart,String uname) {
		cartdao.add(cart,uname);
		System.out.println("cartservice ");
	}

	@Transactional
	public List getAllProducts() {
		System.out.println("cartserviceimpl");
		return cartdao.getAllProducts();
		
	}

}


