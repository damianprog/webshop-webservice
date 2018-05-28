package com.webshop.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.Address;
import com.webshop.webservice.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addresses")
	public Address saveAddressAndReturn(@RequestBody Address address) {
		return addressService.saveAddressAndReturn(address);
		
	}
	
	@RequestMapping("/addresses/{addressId}")
	public Address getAddressById(@PathVariable("addressId") int addressId) {
		return addressService.getAddressById(addressId);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/addresses/{addressId}/delete")
	public void deleteAddressById(@PathVariable("addressId") int addressId) {
		addressService.deleteAddressById(addressId);
	}
	
}
