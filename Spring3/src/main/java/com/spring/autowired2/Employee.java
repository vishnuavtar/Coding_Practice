package com.spring.autowired2;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	
	@Autowired
	Address address;
	
	public Employee(Address address) {
		super();
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	private int id;
	private String name;
	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
}
