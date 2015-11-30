package com.fockers.springtest;

public class Address {

	private String street;
	private String postcode;
	
	
	public Address()
	{
		
	}
	
	public Address(String street, String postcode) {

		this.street = street;
		this.postcode = postcode;
	}


	@Override
	public String toString() {
		return "Address [address=" + street + ", postcode=" + postcode + "]";
	}
	

	public void setStreet(String street) {
		this.street = street;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	
	
}
