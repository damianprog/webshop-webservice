package com.webshop.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webshop.webservice.entity.CreditCard;
import com.webshop.webservice.entity.Order;
import com.webshop.webservice.repository.CreditCardRepository;
import com.webshop.webservice.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CreditCardRepository creditCardRepository;
	
	public void saveOrder(Order order) {
		orderRepository.save(order);
	}

	public Order getOrderById(int id) {
		return orderRepository.findOne(id);
	}

	public List<Order> getOrdersByUserId(int userId) {
		return orderRepository.findAllByUserId(userId);
	}
	
	public void saveCreditCard(CreditCard creditCard) {
		creditCardRepository.save(creditCard);
	}
	
}
