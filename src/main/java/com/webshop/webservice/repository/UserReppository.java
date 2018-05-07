package com.webshop.webservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.webshop.webservice.entity.User;

public interface UserReppository extends CrudRepository<User,Integer>{

	public User findOneByUserName(String userName);
	
}
