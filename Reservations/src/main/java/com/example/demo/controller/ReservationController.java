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

import com.example.demo.repo.ReservationRepo;
import com.example.demo.user.ReservationDetails;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	 @Autowired
	    private ReservationRepo reservationRepository;

	    @GetMapping(value = "/list")
	    public List<ReservationDetails> getAllReservationDetails(){
	        return reservationRepository.findAll();
	    }
	    @PostMapping(value = "/add")
	    public ReservationDetails addNewGuest(@RequestBody ReservationDetails up){
	        return reservationRepository.save(up);
	    }
	    @DeleteMapping(value = "/delete/{membercode}")
	    public void deleteGuest(@PathVariable String membercode) {
	        System.out.println("Delete method called");
	        reservationRepository.deleteById(membercode);
	    }
	    @PutMapping(value="/update/{membercode}")
	    public ReservationDetails updateGuestDetaisl(@PathVariable ReservationDetails membercode) {
	    	 System.out.println("Update method called");
	    	return reservationRepository.save(membercode);
	    }
}



