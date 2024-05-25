package STring2;

import java.util.Scanner;

public class REmoveCharacter {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter charcter - ");
		String str2 = sc.nextLine();
		System.out.print(str2);
		System.out.print(ToRemove(str,str2));
	}
	
	public static String ToRemove(String str, String str2) {
		return str.replaceAll(str2, "");
	}

}
