package com.webshop.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Product;
import com.webshop.webservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product getProductById(int productId) {
		return productRepository.findOne(productId);
	}

	public Product getProductByName(String productName) {
		return productRepository.findOneByName(productName);
	}

	public void saveProduct(Product product) {
		productRepository.save(product);
	}
	
	
	
}
