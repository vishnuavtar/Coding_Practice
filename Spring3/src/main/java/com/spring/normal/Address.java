package com.spring.normal;

public class Address {
	
	private String street;
	private String pin;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}
	public Address(String street, String pin) {
		super();
		this.street = street;
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}

}
