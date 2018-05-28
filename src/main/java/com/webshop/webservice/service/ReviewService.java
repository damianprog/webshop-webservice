package com.webshop.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Review;
import com.webshop.webservice.jparepository.ReviewRepositoryJpa;
import com.webshop.webservice.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private ReviewRepositoryJpa reviewRepositoryJpa;
	
	public Review getReviewById(int reviewId) {
		return reviewRepository.findOne(reviewId);
	}
	
	public List<Review> getReviewsByUserId(int userId) {
		return reviewRepository.findAllByUserId(userId);
	}
	
	public List<Review> getReviewsByProductId(int productId) {
		return reviewRepository.findAllByProductId(productId);
	}
	
	public void saveReview(Review review) {
		reviewRepository.save(review);
	}

	public Page<Review> getReviewsByProductIdPageable(int productId, PageRequest pageRequest) {

		return reviewRepositoryJpa.findAllByProductId(productId,pageRequest);
		
	}

	
	
}
