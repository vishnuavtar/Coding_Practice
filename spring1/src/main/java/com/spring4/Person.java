package com.spring4;

public class Person {
	
	private String name;
	private int personid;
	private Certi certi;
	public Person(String name, int personid ,Certi certi) {
		super();
		this.name = name;
		this.personid = personid;
		this.certi=certi;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personid=" + personid + ", certi=" + certi + "]";
	}

}
