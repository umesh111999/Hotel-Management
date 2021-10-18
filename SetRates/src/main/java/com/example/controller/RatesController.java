package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rates.SetRatesDetails;
import com.example.repo.RatesRepo;

@RestController
@RequestMapping("/SetRates")
public class RatesController {
	 @Autowired
	    private RatesRepo ratesRepository;

	    @GetMapping(value = "/list")
	    public List<SetRatesDetails> getAllRatesDetails(){
	        return ratesRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public SetRatesDetails addNewRate(@RequestBody SetRatesDetails up){
	        return ratesRepository.save(up);
	    }
	   
	    }

