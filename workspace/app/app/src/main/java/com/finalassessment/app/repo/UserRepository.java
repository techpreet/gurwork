package com.finalassessment.app.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.finalassessment.app.beans.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	public List<User> findByuserId(String name); 
}