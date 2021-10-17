package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.user.ReservationDetails;

public interface ReservationRepo extends  MongoRepository<ReservationDetails, String> {
	
}