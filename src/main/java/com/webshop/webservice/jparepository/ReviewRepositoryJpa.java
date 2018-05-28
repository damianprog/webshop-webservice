package com.webshop.webservice.jparepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.webshop.webservice.entity.Review;

public interface ReviewRepositoryJpa extends JpaRepository<Review,Integer>{

	Page<Review> findAllByProductId(int productId,Pageable pageable);
	
}
