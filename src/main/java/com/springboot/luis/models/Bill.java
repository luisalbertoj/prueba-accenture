package com.springboot.luis.models;

import java.io.Serializable;
import java.util.List;

public class Bill implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private List<Product> products;
	private User user;
	private float subTotal;
	private float domicilio;
	private float total;
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public float getTotal() {
		return total;
	}
	
	public void setTotal(float f) {
		this.total = f;
	}

	public float getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(float domicilio) {
		this.domicilio = domicilio;
	}

	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	
	

}
