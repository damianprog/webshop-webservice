package com.webshop.webservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.CreditCard;
import com.webshop.webservice.service.CreditCardService;

@RestController
public class CreditCardController {

	@Autowired
	private CreditCardService creditCardService;
	
	@RequestMapping("/creditCards/{creditCardId}")
	public CreditCard getCreditCardById(@PathVariable int creditCardId) {
		return creditCardService.getCreditCardById(creditCardId);
	}
	
	@RequestMapping("/users/{userId}/creditCards")
	public List<CreditCard> getCreditCardsByUserId(@PathVariable int userId) {
		return creditCardService.getCreditCardsByUserId(userId);
	}
	
	@RequestMapping("/users/{userId}/creditCards/default")
	public CreditCard getDefaultCreditCardByUserId(@PathVariable int userId) {
		return creditCardService.getDefaultCreditCardByUserId(userId);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/creditCards")
	public void updateCreditCard(@RequestBody CreditCard creditCard) {
		creditCardService.saveCreditCard(creditCard);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/creditCards")
	public CreditCard saveCreditCard(@RequestBody CreditCard creditCard) {
		return creditCardService.saveCreditCard(creditCard);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/creditCards/{creditCardId}/delete")
	public void removeCreditCardById(@PathVariable int creditCardId) {
		creditCardService.removeCreditCardById(creditCardId);
	}
	
}
