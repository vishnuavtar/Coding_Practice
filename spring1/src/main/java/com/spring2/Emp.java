package com.spring2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	
	
	public Emp() {
		super();
	}
	private String name;
	
	private List<String> phone;
	private Set<String> addresses;
	private Map<String,String> courses;
	public Emp(String name, List<String> phone, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
