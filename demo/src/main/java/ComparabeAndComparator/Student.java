package ComparabeAndComparator;

public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student() {
		super();
	}
	@Override
	public int compareTo(Student o) {
		
		return  this.id-o.id;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
