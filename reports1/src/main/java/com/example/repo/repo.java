package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.user.user;

public interface repo extends  MongoRepository<user, String> {
	user findProductById(String Id);

	
	 


}