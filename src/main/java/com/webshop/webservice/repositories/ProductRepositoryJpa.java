package com.webshop.webservice.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.webservice.entity.Product;

public interface ProductRepositoryJpa extends JpaRepository<Product,Integer>{

	Page<Product> findAllByCategory(String category,Pageable pageable);
	
}
