package ListOfStrudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfStrudent {

	public static void main(String[] args) {

		System.out.println("Enter Five Employee ");

		List<Employee> list = new ArrayList<>();
		
		
		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Id = "); int id = sc.nextInt();
			//System.out.println("Enter Name = "); String name = sc.nextLine();
			System.out.println("Enter Email = "); String email = sc.nextLine();
			
			list.add(new Employee(id,email));
		}
		for (Employee e : list) {

			System.out.println(e.id + " " + e.name + " " + e.email);
		}

	}

}
