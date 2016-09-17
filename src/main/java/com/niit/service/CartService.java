package com.niit.service;

import java.util.List;

import com.niit.model.Cart;

public interface CartService {
	public void add(Cart cart,String uname);
	public List getAllProducts();

}
