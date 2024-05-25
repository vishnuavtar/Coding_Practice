package nCodeIT;

public class Demo {
	
	int StudentId;
	String name;
	int avg;
	
	Demo(int id, String name, int avg){
		this.StudentId = id;
		this.name=name;
		this.avg=avg;
	}
	
	double Display(double roll){
		return roll;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Fine");
		
		Demo d = new Demo(1, "abc", 10);
		System.out.print(d.StudentId + " ");
		System.out.print(d.name  + " ");
		System.out.print(d.avg  + " ");
		
		System.out.println(" \n " + d.Display(12345));
	}

}
