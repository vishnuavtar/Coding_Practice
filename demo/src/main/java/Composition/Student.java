package Composition;

public class Student implements Comparable<Student>{
	
	private int sid;
	private String name;
	
	
	public Student(int sid,String name) {
		super();
		this.sid =sid;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}

	public int getSid(int sid) {
		return sid;
	}
	
	public int setSid(int sid) {
		return this.sid-sid;
	}
	
	public String getName(String name) {
		return name;
	}
	
	
	public String setName(String name) {
		return this.name=name;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.sid-o.sid;
	}
	

}
