package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.guest.details;
import com.example.repo.repo;

@RestController
@RequestMapping("/profile1")
public class controller {
	 @Autowired
	    private repo profileRepository;

	    @GetMapping(value = "/list")
	    public List<details> getAllDetails(){
	        return profileRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public details addNewGuestDetails(@RequestBody details up){
	        return profileRepository.save(up);
	    }
}