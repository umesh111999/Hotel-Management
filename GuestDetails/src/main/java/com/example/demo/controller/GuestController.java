package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.details.GuestDetails;
import com.example.demo.repo.UserRepo;

@RestController
@RequestMapping("/guest")
public class GuestController {
	 @Autowired
	    private UserRepo guestRepository;

	    @GetMapping(value = "/list")
	    public List<GuestDetails> getAllGuestDetails(){
	        return guestRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public GuestDetails addNewGuest(@RequestBody GuestDetails up){
	        return guestRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{membercode}")
	    public void deleteGuest(@PathVariable String membercode) {
	        System.out.println("Delete method called");
	        guestRepository.deleteById(membercode);
	    }
	    @PutMapping(value="/update/{membercode}")
	    public GuestDetails updateGuestDetaisl(@PathVariable GuestDetails membercode) {
	    	 System.out.println("Update method called");
	    	return guestRepository.save(membercode);
	    }
}