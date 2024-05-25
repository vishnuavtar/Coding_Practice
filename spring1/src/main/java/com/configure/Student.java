package com.configure;

//@Component("firststudent")
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}

	public void study() {
		
		samosa.display();
		System.out.println("Reading");
	}

}
