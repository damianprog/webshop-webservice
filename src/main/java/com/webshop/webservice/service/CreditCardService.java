package com.webshop.webservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.CreditCard;
import com.webshop.webservice.repository.CreditCardRepository;

@Service
public class CreditCardService {

	@Autowired
	private CreditCardRepository creditCardRepository;

	public void saveCreditCard(CreditCard creditCard) {
		creditCardRepository.save(creditCard);
	}

	public CreditCard getCreditCardById(int creditCardId) {
		return creditCardRepository.findOne(creditCardId);
	}

	public List<CreditCard> getCreditCardsByUserId(int userId) {
		return creditCardRepository.findOneByUserId(userId);
	}

	public CreditCard getDefaultCreditCardByUserId(int userId) {
		return creditCardRepository.findOneByUserIdAndIsItDefault(userId, true);
	}

	public void removeCreditCardById(int creditCardId) {
		creditCardRepository.delete(creditCardId);
	}
	
	
	
}
