package com.webshop.webservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.webservice.entity.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findOneByName(String productName);


	
}
