package String4;

import java.util.Scanner;

public class Occurence {
 
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.print(ch);
		System.out.println(ToCOunt(str,ch));
		
	}
	
	public static int ToCOunt(String str,char ch) {
		
		int count=0;
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
