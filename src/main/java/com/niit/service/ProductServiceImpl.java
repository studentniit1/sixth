package com.niit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.ProductDao;
import com.niit.model.Products;
import com.niit.model.UserBean;
@Service
@Transactional
public class ProductServiceImpl  implements ProductService{
@Autowired(required=true)
private ProductDao productdao;


@Override	
public void add(Products products){
	productdao.add(products);
	
}
@Override	
public void edit(Products products){
	productdao.edit(products);
	
}
@Override	
public void delete(String getId){
	productdao.delete(getId);
	
}
@Override
public Products getProducts(String getId){
	return productdao.getProducts(getId);                        
}
@Override
public List getAllProducts(){
	return productdao.getAllProducts();
}

@Override
public List getAllBabyPowders(){
	return productdao.getAllBabyPowders();
}
@Override
public List getAllBabyOil(){
	return productdao.getAllBabyOil();
}
@Override
public List getAllShampoos(){
	return productdao.getAllShampoos();
}
@Override
	public List getAllBabySoap(){
		return productdao.getAllBabySoap();
}

@Override
		public List getAllBabyLotion(){
			return productdao.getAllBabyLotion();
}
@Override
public void s(UserBean userBean) {
	// TODO Auto-generated method stub
	productdao.s(userBean);
}

	
	
	
	
	
}


