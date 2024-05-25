package String42;

import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		
		String str = "This is String";
		
		Scanner sc = new Scanner(System.in);
		
		char str2 = sc.next().charAt(0);
		
		System.out.println(str2);
		
		System.out.println(ToOccurence(str,str2));
	}
	
	public static int ToOccurence(String str,char str2) {
		
		int count = 0;
		
		int a[] = new int[str.length()];
		
		for(int i = 0; i<a.length; i++) {
			a[i] = str.charAt(i);
			
			if(a[i]==str2) {
				count++;
			}
		}
		return count;
	}
}
