package String13;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		System.out.println(str);
		System.out.println("Character for count");
		Scanner sc  = new Scanner(System.in);
		
		char str2 = sc.next().charAt(0);
		System.out.println(str);
		System.out.println(ToOccuren(str,str2));
	}
	
	public static int ToOccuren(String str,char ch) {
		int count = 0; 
		int a[] = new int[str.length()];
		for(int i = 0; i<str.length(); i++) {
			a[i] = str.charAt(i);
			if(a[i]==ch) {
				count++;
			}
		}
		
		return count;
	}

}
