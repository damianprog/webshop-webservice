package com.webshop.webservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webshop.webservice.entity.Rating;

public interface RatingRepository extends CrudRepository<Rating,Integer>{

	public List<Rating> findAllByProductId(int productId);
	
	public List<Rating> findAllByUserId(int userId);
	
}
