package com.training.nosql.mongodb;

import org.mongodb.morphia.annotations.Entity;

//@Entity
public class Address {
	private String street;
	private String city;
	private int pincode;
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	public Address(String street, String city, int pincode) {
		super();
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
