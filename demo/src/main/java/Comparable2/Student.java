package Comparable2;

public class Student  implements Comparable<Student>{
	
	
	@Override
	public int compareTo(Student o) {
		return o.id-o.getId();
	}
	
	private String name;

	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	public Student() {
		super();
	}
	public Student(int id, String name) {
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
