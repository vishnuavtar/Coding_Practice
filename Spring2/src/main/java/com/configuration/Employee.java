package com.configuration;

public class Employee {

	private Address address;

	@Override
	public String toString() {
		return "Student [address=" + address + ", id=" + id + ", name=" + name + "]";
	}

	private int id;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address, int id, String name) {
		super();
		this.address = address;
		this.id = id;
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

}
