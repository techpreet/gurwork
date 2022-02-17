package com.gur.rest.works.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.gur.rest.works.beans.UserInfo;
import com.gur.rest.works.repo.UserRepository;

@Configuration
@EnableMongoRepositories(basePackageClasses = UserRepository.class)
public class MongoConfig {

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepo) {
//		return string -> userRepo.insert(new User(101, "Sumedh", 1234, "sumedh@gmail.com"));
		return null; 
	}
}
