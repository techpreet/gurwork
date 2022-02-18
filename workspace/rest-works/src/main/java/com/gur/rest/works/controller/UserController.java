package com.gur.rest.works.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gur.rest.works.beans.UserInfo;
import com.gur.rest.works.exception.UserNotFoundException;
import com.gur.rest.works.proxy.UserAddressProxy;
import com.gur.rest.works.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	private UserAddressProxy userProxy;

	@GetMapping("/")
	public String sayHello() {
		return "Service Is Up";
	}

	@GetMapping("/user/address/{name}")
	public String getUserAddress(String name) {
		return userProxy.getAddress(name);
	}

	// GET http://localhost:9090/user
	@GetMapping("/user")
	public List<UserInfo> getUsers() {
		return service.getAllUsers();
	}

	// GET http://localhost:9090/user/112
	@GetMapping("/user/{id}")
	public UserInfo getUserById(@PathVariable("id") Integer id) throws UserNotFoundException {
		UserInfo retUser = service.getUserByIdAsObject(id);

		if (retUser == null) {
			throw new UserNotFoundException("Sorry User With " + id + " not found");
		}

		return retUser;
	}

	// POST http://localhost:9090/user
	@PostMapping("/user")
	public ResponseEntity<?> saveUser(@RequestBody UserInfo user) {
		UserInfo returnedUser = service.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(returnedUser);
	}

	// PUT -> update
	// DELETE -> delete
	// GET - get users by name

}