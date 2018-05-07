package com.webshop.webservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.webservice.entity.User;
import com.webshop.webservice.entity.UserRole;
import com.webshop.webservice.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/users/{userId}")
	public User getUserById(@PathVariable int userId) {

		return userService.getUserById(userId);

	}

	@RequestMapping("/users/names/{userName}")
	public User getUserById(@PathVariable String userName) {

		return userService.getUserByUserName(userName);

	}

	@RequestMapping(method=RequestMethod.PUT,value="/users")
	public void saveUser(@RequestBody User user) {

		userService.saveUser(user);

	}
	
	@RequestMapping(method=RequestMethod.POST,value="/userRoles")
	public void saveUserRole(@RequestBody UserRole userRole) {
		System.out.println("######################## " + userRole.getId() + " " + userRole.getRoleId());
		userService.saveUserRole(userRole);
	}

}
