package com.niit.service;

import java.util.List;

import com.niit.model.Products;
import com.niit.model.UserBean;

public interface ProductService {
	
	public void add(Products products);
	public void edit(Products products);
	public void delete(String Id);
	public Products getProducts(String getId);
	public List getAllProducts();
	public List getAllBabyLotion();
	public List getAllBabySoap();
	public List getAllShampoos();
	public List getAllBabyOil();
	public List getAllBabyPowders();
	public void s(UserBean userBean);
}
