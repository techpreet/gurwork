package com.finalassessment.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalassessment.app.beans.User;
import com.finalassessment.app.repo.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.insert(user);

	}

	public User updateUser(User user) {
		return userRepository.save(user);
	}

	public Optional<User> getUserById(Integer id) {
		return userRepository.findById(id);

	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public void deleteUser(Integer userId) {
		userRepository.deleteById(userId);
	}

	public void deleteAllUsers() {
		userRepository.deleteAll();
	}

}
