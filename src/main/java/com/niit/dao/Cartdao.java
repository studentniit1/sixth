
package com.niit.dao;

import java.util.List;

import com.niit.model.Cart;

public interface Cartdao {
	
	public void add(Cart cart,String uname);
	public List getAllProducts(); 
		
	


}
