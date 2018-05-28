package com.webshop.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Rating;
import com.webshop.webservice.repository.RatingRepository;

@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepository;
	
	public Rating getRatingById(int ratingId) {
		return ratingRepository.findOne(ratingId);
	}
	
	public List<Rating> getRatingsByUserId(int userId) {
		return ratingRepository.findAllByUserId(userId);
		
	}
	
	public List<Rating> getRatingsByProductId(int productId) {
		return ratingRepository.findAllByProductId(productId);
		
	}
	
	public void saveRating(Rating rating) {
		ratingRepository.save(rating);
		
	}
	
}
