package com.fockers.springtest;

public class Address {

	private String street;
	private String postcode;
	
	
	
	
	public Address(String street, String postcode) {

		this.street = street;
		this.postcode = postcode;
	}


	@Override
	public String toString() {
		return "Address [address=" + street + ", postcode=" + postcode + "]";
	}
	
	
	
}
