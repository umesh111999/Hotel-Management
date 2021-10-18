package com.example.rates;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "SetRates")
public class SetRatesDetails {
	@Id
	private String code;
    private String Checkin;
	private String Checkout;
	private String  Guest;
	private String day;
	private String firstnightprice;
	private String Extensionprice;
	public String getCheckin() {
		return Checkin;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getFirstnightprice() {
		return firstnightprice;
	}
	public void setFirstnightprice(String firstnightprice) {
		this.firstnightprice = firstnightprice;
	}
	public String getExtensionprice() {
		return Extensionprice;
	}
	public void setExtensionprice(String extensionprice) {
		Extensionprice = extensionprice;
	}
	
	public SetRatesDetails(String code) {
		super();
		this.code = code;
	}
	public SetRatesDetails(String checkin, String checkout, String guest, String day, String firstnightprice,
			String extensionprice) {
		super();
		Checkin = checkin;
		Checkout = checkout;
		Guest = guest;
		this.day = day;
		this.firstnightprice = firstnightprice;
		Extensionprice = extensionprice;
	}
	
}
	
		