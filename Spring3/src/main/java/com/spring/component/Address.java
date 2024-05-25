package com.spring.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {

	@Value("Patna")
	private String street;

	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}

	@Value("1234")
	private String pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
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
