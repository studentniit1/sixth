package com.niit.dao;

import java.util.List;

import com.niit.model.Products;
import com.niit.model.UserBean;

public interface ProductDao {

public 	void add(Products products);

public void edit(Products products);

public void delete(String getId);

public Products getProducts(String getId);

public List getAllProducts();

public List getAllBabyPowders();

public List getAllBabyOil();

public List getAllShampoos();

public List getAllBabySoap();

public List getAllBabyLotion();

public void s(UserBean userBean);

}
