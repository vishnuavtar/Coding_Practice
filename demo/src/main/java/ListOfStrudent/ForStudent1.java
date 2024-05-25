package ListOfStrudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ForStudent1 {
	
	public static void main(String[] args) {
		
		List<Student1> list = new ArrayList<>();
		
		System.out.println("Enter 3 Records = ");
		
		for(int i = 0; i<3; i++) {
			
			Scanner sc  = new Scanner(System.in);
			
			System.out.print("Enter Student id = "); int id = sc.nextInt();
			System.out.print("Enter Student Name = "); String name = sc.nextLine();
			//System.out.print("Enter Student Email = "); String email = sc.nextLine();
			System.out.print("Enter Student Description  = "); String desc = sc.nextLine();
			
			list.add(new  Student1(id,name,desc));
			
		}
		
		for(Student1 ss:list) {
			System.out.println("Student Id = " + Student1.id + " " +" "+ "Student Name = "+ Student1.name  + " "+ "Student Email = " +Student1.email + " " + "Student Description =" + Student1.desc);
		}
		
	}

}
