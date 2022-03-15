package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	private String street1;
	private int zipcode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Address(String street1, int zipcode) {
		super();
		this.street1 = street1;
		this.zipcode = zipcode;
	}
	
	public String getStreet1() {
		return street1;
	}
	
	@Value("street3")
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	
	public int getZipcode() {
		return zipcode;
	}
	
	@Value("898898")
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", zipcode=" + zipcode + "]";
	}
	
	
}
