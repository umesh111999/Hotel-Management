package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.RoomDetails.RoomDetails;

public interface RoomRepo extends  MongoRepository<RoomDetails, String> {
	
}