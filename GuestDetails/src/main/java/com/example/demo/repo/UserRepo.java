package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.details.GuestDetails;

public interface UserRepo extends  MongoRepository<GuestDetails, String> {
	
}