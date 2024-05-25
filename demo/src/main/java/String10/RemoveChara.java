package String10;

import java.util.Scanner;

public class RemoveChara {
	
	public static void main(String[] args) {
		
		
		String str = "This is my job";
		
		Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		
		System.out.println(str);
		System.out.println(ToRemove(str,str2));
	}
	
	public static String ToRemove(String str,String str2) {
		return str.replaceAll(str2, " ");
	}
	
	

}
