package String9;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		Scanner sc = new Scanner(System.in);
		
		char str2 = sc.next().charAt(0);
		System.out.println(str2);
		System.out.println(toOccurence(str,str2));
	}
	
	public static int toOccurence(String str,char str2) {
		
		int count = 0; 
	
		int ar[] = new int[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ar[i] = str.charAt(i);
			if(ar[i]==str2) {
				count++;
			}
			
		}
	
		return count;
	}

}
