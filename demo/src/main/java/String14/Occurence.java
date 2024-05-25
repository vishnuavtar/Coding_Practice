package String14;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enter String - ");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str);
		char str2 = sc.next().charAt(0);
		System.out.println(str2);
		System.out.println(toOccurence(str,str2));
	}

	public static int toOccurence(String str,char str2) {
		int count = 0; 
		char[] ch = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			if(ch[i]==str2) {
				count++;
			}
		}
		return count;
		
	}
}
