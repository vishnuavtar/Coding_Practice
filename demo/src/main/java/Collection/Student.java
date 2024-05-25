package Collection;

public class Student implements Comparable<Student>{
	
	
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}

	private int id;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	private String name;
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
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
}
