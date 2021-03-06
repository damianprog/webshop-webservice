package com.webshop.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.CreditCard;
import com.webshop.webservice.entity.Order;
import com.webshop.webservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@RequestMapping(method=RequestMethod.POST,value="/orders")
	public void saveOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		
	}

	@RequestMapping("/orders/{id}")
	public Order getOrderById(@PathVariable int id) {
		return orderService.getOrderById(id);
	}

	@RequestMapping("/orders/creditCards/{creditCardId}")
	public List<Order> getOrdersByCreditCardId(@PathVariable int creditCardId) {
		return orderService.getOrdersByCreditCardId(creditCardId);
	}
	
	@RequestMapping("/users/{userId}/orders")
	public List<Order> getOrdersByUserId(@PathVariable int userId) {
		return orderService.getOrdersByUserId(userId);
	}
	
}
