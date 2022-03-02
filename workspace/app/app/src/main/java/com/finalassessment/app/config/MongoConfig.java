package com.finalassessment.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.finalassessment.app.beans.User;
import com.finalassessment.app.repo.UserRepository;

@Configuration
public class MongoConfig {
	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
//	return string -> userRepository.insert(new User(3,"gurpreet","singh","gguri365@gmail.com","password@123",1234567890,"patiala","5-sep-1999"));	
	return null;
}
}
