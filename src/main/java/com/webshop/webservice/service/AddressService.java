package com.webshop.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Address;
import com.webshop.webservice.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address saveAddressAndReturn(Address address) {
		return addressRepository.save(address);
		
	}

	public Address getAddressById(int addressId) {
		return addressRepository.findOne(addressId);
	}

	public void deleteAddressById(int addressId) {
		addressRepository.delete(addressId);
	}
	
	
	
}
