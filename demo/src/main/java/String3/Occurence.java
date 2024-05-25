package String3;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		String str = "This is my Job";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String for count -- ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		System.out.println(ToOccurence(str,ch));
		
	}
	
	public static int ToOccurence(String str,char ch) {
		int count = 0;
		int[] ar = new int[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ar[i]  = str.charAt(i);
			if(ar[i]==ch) {
				count++;
			}
			
		}
		return count;
		
		
	}

}
