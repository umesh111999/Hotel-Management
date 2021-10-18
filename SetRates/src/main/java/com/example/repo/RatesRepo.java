package com.example.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.rates.SetRatesDetails;

public interface RatesRepo extends  MongoRepository<SetRatesDetails, String> {
	
}