package com.niit.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cart {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private double price;
private int qty;
@ManyToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,targetEntity=Products.class)
private Products products;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public Products getProducts() {
	return products;
}
public void setProducts(Products products) {
	this.products = products;
}

}
