package String;

import java.util.*;
public class Occurence {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ENter your String");
		String str = sc.nextLine();
		System.out.println("Enter character to count -- ");
		char str2 = sc.next().charAt(0);
		System.out.println(str2);
		System.out.print(ToCount(str,str2));
		
	}
	
	public static int ToCount(String str, char str2) {
		int count=0;
		int[] ar = new int[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ar[i] = str.charAt(i);
			if(ar[i]==str2) {
				count++;
			}
		}
		return count;
	}

}
