package Collection;

public class Student1 implements Comparable<Student123> {
	
	private int id;
	private String name;
	private String email;
	public Student1() {
		super();
	}
	public int getId() {
		return id;
	}
	public Student1(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
