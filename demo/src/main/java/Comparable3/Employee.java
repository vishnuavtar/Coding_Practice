package Comparable3;

public class Employee implements Comparable<Employee>{
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
	public int getId() {
		return id;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	private int id;
	private String name;
}
