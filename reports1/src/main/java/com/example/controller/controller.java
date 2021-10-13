package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repo.repo;
import com.example.user.user;

@RestController
@RequestMapping("/profile1")
public class controller {
	 @Autowired
	    private repo profileRepository;

	    @GetMapping(value = "/list")
	    public List<user> getAllDetails(){
	        return profileRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public user addNewGuestDetails(@RequestBody user up){
	        return profileRepository.save(up);
	    }
}