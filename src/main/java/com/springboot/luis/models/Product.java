package com.springboot.luis.models;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer sku; 
	private String titulo;
	private Integer precio;
	
	public Product() {
	    super();
	}
	
	public Product(Integer sku,String titulo, Integer precio) {
		super();
		this.sku = sku;
		this.titulo = titulo;
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Integer getSku() {
		return sku;
	}

	public void setSku(Integer sku) {
		this.sku = sku;
	}
	
	
}
