package com.webshop.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Order;
import com.webshop.webservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}

	public Order getOrderById(int id) {
		return orderRepository.findOne(id);
	}

	public List<Order> getOrdersByUserId(int userId) {
		return orderRepository.findAllByUserId(userId);
	}
	
}
