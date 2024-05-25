package String29;

import java.util.Scanner;

public class RemoveCharacter {
	
	public static void main(String[] args) {
		
		String str = "This is String";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character for remove");
		String str2 = sc.nextLine();
		
		System.out.println(str2);
		System.out.println(ToRemove(str,str2));
	}

	public static String ToRemove(String str, String str2) {
		return str.replaceAll(str2, " ");
	}
	
	
}
