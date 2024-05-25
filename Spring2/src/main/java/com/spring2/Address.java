package com.spring2;

public class Address {
	
	private String street;
	private String pin;
	public String getStreet() {
		return street;
	}
	public Address(String street, String pin) {
		super();
		this.street = street;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
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
