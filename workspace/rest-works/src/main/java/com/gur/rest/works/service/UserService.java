package com.gur.rest.works.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gur.rest.works.beans.UserInfo;
import com.gur.rest.works.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepo;
	
	
	public UserInfo saveUser(UserInfo user) {
		return userRepo.insert(user);
	}
	
	public UserInfo updateUser(UserInfo user) {
		return userRepo.save(user); 
	}

	public Optional<UserInfo> getUserById(Integer id) {
		return userRepo.findById(id); 
	}

	public  UserInfo  getUserByIdAsObject(Integer id) {
		Optional<UserInfo> byId = userRepo.findById(id);
		return byId.isPresent()? byId.get(): null; 
	}
	
	public List<UserInfo> getAllUsers() {
		return userRepo.findAll(); 
	}
	
	public List<UserInfo> getUsersByName(String name){
		return userRepo.findByName(name); 
	}
	
	public void deleteUser(Integer Id) {
		userRepo.deleteById(Id);
	}
	
	
	
}