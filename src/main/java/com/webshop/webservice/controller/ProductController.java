package com.webshop.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.Product;
import com.webshop.webservice.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/products/{productId}")
	public Product getProductById(@PathVariable int productId) {
		
		return productService.getProductById(productId);
		
	}
	
	@RequestMapping("/products/name/{productName}")
	public Product getProductByName(@PathVariable String productName) {
		
		return productService.getProductByName(productName);
		
	}

	@RequestMapping(method=RequestMethod.POST,value="/products")
	public void saveProduct(@RequestBody Product product) {
		
		productService.saveProduct(product);
		
	}
	
}
