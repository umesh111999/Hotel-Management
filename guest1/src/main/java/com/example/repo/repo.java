package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.guest.details;

public interface repo extends  MongoRepository<details, String> {
	details findProductById(String Id);

	
	 


}