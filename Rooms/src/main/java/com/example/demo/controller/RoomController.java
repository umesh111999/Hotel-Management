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

import com.example.demo.RoomDetails.RoomDetails;
import com.example.demo.repo.RoomRepo;

@RestController
@RequestMapping("/RoomDetails")
public class RoomController {
	 @Autowired
	    private RoomRepo roomRepository;

	    @GetMapping(value = "/list")
	    public List<RoomDetails> getAllRoomDetails(){
	        return roomRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public RoomDetails addNewRoom(@RequestBody RoomDetails up){
	        return roomRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{membercode}")
	    public void deleteRoom(@PathVariable String membercode) {
	        System.out.println("Delete method called");
	        roomRepository.deleteById(membercode);
	    }
	    @PutMapping(value="/update/{membercode}")
	    public RoomDetails updateRoomDetails(@PathVariable RoomDetails membercode) {
	    	 System.out.println("Update method called");
	    	return roomRepository.save(membercode);
	    }
}
