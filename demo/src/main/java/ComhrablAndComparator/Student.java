package ComhrablAndComparator;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
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
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
}
