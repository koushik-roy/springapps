package com.springdemos.springcore.constructorinjection;

public class Address {

	private int housenumber;
	private String street;
	private String city;

	public Address(int hnum, String street, String city) {
		this.housenumber = hnum;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", street=" + street + ", city=" + city + "]";
	}

}
