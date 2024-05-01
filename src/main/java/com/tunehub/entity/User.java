package com.tunehub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int userid;
     private String username;
     private String password;
     private String email;
     private String gender;
     private String role;
     private long number;
     private String address;
     private boolean premium;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userid, String username, String password, String email, String gender, String role, long number,
			String address, boolean premium) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.role = role;
		this.number = number;
		this.address = address;
		this.premium = premium;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isPremium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", gender=" + gender + ", role=" + role + ", number=" + number + ", address=" + address + ", premium="
				+ premium + "]";
	}
	
     
     
}

