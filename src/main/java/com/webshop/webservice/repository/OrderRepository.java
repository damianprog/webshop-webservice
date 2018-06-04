package com.webshop.webservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webshop.webservice.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

	List<Order> findAllByUserId(int userId);

	List<Order> findAllByCreditCardId(int creditCardId);

}
