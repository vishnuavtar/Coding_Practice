package Comparable5;

public class Employee implements Comparable<Employee>{
	
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}
	
	private int id;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	public Employee() {
		super();
	}
	private String name;
	public int getId() {
		return id;
	}
	public Employee(int id, String name, String email) {
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
	private String email;
	
}
