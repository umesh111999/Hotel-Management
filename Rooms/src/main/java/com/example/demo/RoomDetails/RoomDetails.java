package com.example.demo.RoomDetails;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "RoomDetails")
public class RoomDetails {
	@Id
	private String Period;
	private String Checkin;
	private String Checkout;
	private String Guest;
	public String getPeriod() {
		return Period;
	}
	public void setPeriod(String period) {
		Period = period;
	}
	public String getCheckin() {
		return Checkin;
	}
	public void setCheckin(String checkin) {
		Checkin = checkin;
	}
	public String getCheckout() {
		return Checkout;
	}
	public void setCheckout(String checkout) {
		Checkout = checkout;
	}
	public String getGuest() {
		return Guest;
	}
	public void setGuest(String guest) {
		Guest = guest;
	}
	public RoomDetails(String period, String checkin, String checkout, String guest) {
		super();
		Period = period;
		Checkin = checkin;
		Checkout = checkout;
		Guest = guest;
	}
	
}