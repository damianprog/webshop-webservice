package com.webshop.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.Product;
import com.webshop.webservice.entity.Review;
import com.webshop.webservice.service.ReviewService;

@RestController
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping("/reviews/{reviewId}")
	public Review getReviewById(@PathVariable("reviewId") int reviewId) {
		return reviewService.getReviewById(reviewId);
	}
	
	@RequestMapping("/user/{userId}/reviews")
	public List<Review> getReviewsByUserId(@PathVariable("userId") int userId) {
		return reviewService.getReviewsByUserId(userId);
	}
	
	@RequestMapping("/products/{productId}/reviews")
	public List<Review> getReviewsByProductId(@PathVariable("productId") int productId) {
		return reviewService.getReviewsByProductId(productId);
	}
	
	@RequestMapping("/products/{productId}/reviews/{page}")
	public Page<Review> getReviewsByProductId(@PathVariable("productId") int productId,@PathVariable("page") int page) {
		return reviewService.getReviewsByProductIdPageable(productId,new PageRequest(page-1,10,Sort.Direction.DESC,"id"));
	}
	
	@RequestMapping("/reviews")
	public void saveRating(@RequestBody Review review) {
		reviewService.saveReview(review);
	}
	
}
