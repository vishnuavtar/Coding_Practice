package com.employee;

public class Address {

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", street=" + street + "]";
	}
	public Address() {
		super();
	}
	public Address(int pin, String street) {
		super();
		this.pin = pin;
		this.street = street;
	}
	private int pin;
	private String street;
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

}
