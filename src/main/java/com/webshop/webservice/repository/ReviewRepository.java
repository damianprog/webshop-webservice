package com.webshop.webservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webshop.webservice.entity.Review;

public interface ReviewRepository extends CrudRepository<Review,Integer>{

	public List<Review> findAllByUserId(int userId);
	
	public List<Review> findAllByProductId(int productId);
	
}
