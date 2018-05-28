package com.webshop.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.Rating;
import com.webshop.webservice.service.RatingService;

@RestController
public class RatingController {

	@Autowired
	private RatingService ratingService;
	
	@RequestMapping("/ratings/{ratingId}")
	public Rating getRatingById(@PathVariable("ratingId") int ratingId) {
		return ratingService.getRatingById(ratingId);
	}
	
	@RequestMapping("/user/{userId}/ratings")
	public List<Rating> getRatingsByUserId(@PathVariable("userId") int userId) {
		return ratingService.getRatingsByUserId(userId);
	}
	
	@RequestMapping("/products/{productId}/ratings")
	public List<Rating> getRatingsByProductId(@PathVariable("productId") int productId) {
		return ratingService.getRatingsByProductId(productId);
	}
	
	@RequestMapping("/ratings")
	public void saveRating(@RequestBody Rating rating) {
		ratingService.saveRating(rating);
	}
	
}
