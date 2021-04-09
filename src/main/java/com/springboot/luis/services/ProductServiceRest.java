package com.springboot.luis.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.luis.models.Product;



@RestController
public class ProductServiceRest {
	
	private static List<Product> listaProductos = new ArrayList<Product>() {
        {
            add(new Product(1001, "Pan", 100));
            add(new Product(1002, "Queso", 2000));
            add(new Product(1003, "Leche", 2000));
        }
    };
     
    @RequestMapping(value="/products", method=RequestMethod.GET)
    public List<Product>  getProducts(){
        return listaProductos;
    }
    
    @RequestMapping(value="/products/{sku}", method=RequestMethod.GET)
    public Product  getProduct(@PathVariable Integer id){
    	Product findProduct = null;
    	for (Product product : listaProductos) {
			findProduct = product.getSku() == id? product : null; 
		}
        return findProduct;
    }

}
