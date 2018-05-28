package com.webshop.webservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webshop.webservice.entity.CreditCard;

public interface CreditCardRepository extends CrudRepository<CreditCard,Integer>{

	List<CreditCard> findOneByUserId(int userId);
	
	CreditCard findOneByUserIdAndIsItDefault(int userId,boolean isItDefault);
	
}
