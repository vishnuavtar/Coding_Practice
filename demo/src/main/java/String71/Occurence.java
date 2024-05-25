package String71;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		Scanner sc = new Scanner(System.in);
		
		char str2 = sc.next().charAt(0);
		
		System.out.println(toOccurence(str,str2));
	}
	
	public static int toOccurence(String str,char str2) {
		
		int count = 0;
		int a[] = new int[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			a[i] = str.charAt(i);
			if(a[i]==str2) {
				count++;
			}
		}
		
		return count;
	}

}
