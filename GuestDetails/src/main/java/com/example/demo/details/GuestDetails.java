package com.example.demo.details;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "guest details")
public class GuestDetails {
	@Id
 	private String membercode;
    private String name;
    private String email;
    private String mobileNo;
	private String dateofbirth;
    private String gender;
    private String company;
    private String address;
	public String getMembercode() {
		return membercode;
	}
	public void setMembercode(String membercode) {
		this.membercode = membercode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public GuestDetails(String membercode, String name, String email, String mobileNo, String dateofbirth,
			String gender, String company, String address) {
		super();
		this.membercode = membercode;
		this.name = name;
		this.email = email;
		this.mobileNo = mobileNo;
		this.dateofbirth = dateofbirth;
		this.gender = gender;
		this.company = company;
		this.address = address;
	}
    
}