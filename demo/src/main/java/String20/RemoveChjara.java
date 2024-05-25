package String20;

import java.util.Scanner;

public class RemoveChjara {
	
	public static void main(String[] args) {
		
		String str = "This is a city";
		
		System.out.println("Enter character for remove");
		Scanner sc = new Scanner(System.in);
		
		String str2 = sc.nextLine();
		
		System.out.println(str);
		
		System.out.println(ToRemove(str,str2));
	}
	
	public static String ToRemove(String str,String str2) {
		
		return str.replaceAll(str2, " ");
	}

}
