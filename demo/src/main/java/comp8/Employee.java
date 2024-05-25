package comp8;

public class Employee implements Comparable<Employee> {

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getId()-o.getId();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	private int id;
	private String name;

	public Employee(int id, String name) {
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

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
