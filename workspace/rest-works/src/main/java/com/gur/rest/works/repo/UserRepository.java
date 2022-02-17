package com.gur.rest.works.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gur.rest.works.beans.UserInfo;

@Repository
public interface UserRepository extends MongoRepository<UserInfo, Integer> {

	// + if you want customized queries you can write here 
	public List<UserInfo> findByName(String name); 
}
