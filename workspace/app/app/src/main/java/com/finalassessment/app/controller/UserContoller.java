package com.finalassessment.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalassessment.app.beans.User;
import com.finalassessment.app.exception.UserNotFoundException;
import com.finalassessment.app.service.UserService;


@RestController
@RequestMapping("user")
public class UserContoller {
	@Autowired
	private UserService service;
	
	

	
	//To add new userRegistration
	@PostMapping("/")
	public String saveBook(@RequestBody User user)
	{
		service.saveUser(user);
		return "Added trainer with id: "+user.getUserId();
		
	}
	
	//To get all userlogin
	@GetMapping("/")
	public List<User> getAllUsers()
	{
		return service.getAllUsers();
	}
	
	
	 //To get any userlogin
	@GetMapping("{id}")
	public Optional<User> getTrainer(@PathVariable int id)
	{
		return service.getUserById(id);
	}
	
	
	 //To update the userRegistration
	@PutMapping("/")
	public ResponseEntity<?> updateUser(@RequestBody User user) throws UserNotFoundException{
		
		if(service.getUserById(user.getUserId()).isPresent()) {
			User updateUser = service.updateUser(user);
			return ResponseEntity.status(HttpStatus.OK).body(updateUser);
		} else {
			throw new UserNotFoundException("User Not Found to Update" + user.toString());
		}
	}
	
	
	//Delete login (userTable).
	@DeleteMapping("{id}")
	public String deleteTrainer(@PathVariable int id)
	{
		service.deleteUser(id);
		return "Trainer with id "+id+" deleted";
	}
	
	//Delete all user
	@DeleteMapping()
	public String deleteAllUsers()
	{
		service.deleteAllUsers();
		return "All User deleted";
	}
}
