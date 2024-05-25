package com.employee;

public class Employee {

	Address address;

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Employee(Address address) {
		super();
		this.address = address;
	}

	public Employee() {
		super();
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
