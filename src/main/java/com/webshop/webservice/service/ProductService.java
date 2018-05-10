package com.webshop.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Product;
import com.webshop.webservice.repositories.ProductRepositoryJpa;
import com.webshop.webservice.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductRepositoryJpa productRepositoryJpa;
	
	public Product getProductById(int productId) {
		return productRepository.findOne(productId);
	}

	public Product getProductByName(String productName) {
		return productRepository.findOneByName(productName);
	}

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public Page<Product> getProductsByCategory(String category, Pageable pageable) {
		return productRepositoryJpa.findAllByCategory(category,pageable);
	}
	
	
	
}
