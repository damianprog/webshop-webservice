package com.webshop.webservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webshop.webservice.entity.Address;
import com.webshop.webservice.entity.User;
import com.webshop.webservice.entity.UserRole;
import com.webshop.webservice.repository.UserReppository;
import com.webshop.webservice.repository.UserRoleRepository;

@Service
public class UserService {

	@Autowired
	UserReppository userRepository;

	@Autowired
	UserRoleRepository userRoleRepository;

	public User getUserById(int userId) {

		return userRepository.findOne(userId);

	}

	public User getUserByUserName(String userName) {

		return userRepository.findOneByUserName(userName);

	}

	public User saveUser(User user) {

		return userRepository.save(user);

	}

	public void updateUser(User user) {

		userRepository.save(user);

	}

	public void saveUserRole(UserRole userRole) {

		userRoleRepository.save(userRole);
	}

}
