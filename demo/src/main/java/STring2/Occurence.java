package STring2;

import java.util.Scanner;

public class Occurence {
	
	
	
	public static void main(String[] args) {
		
		String str = "This is my Job";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character or String -- ");
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		System.out.print(ToCount(str,ch));
		
	}
	
	public static int ToCount(String str, char ch) {
		int count=0;
		int ar[] = new int[str.length()];
		for(int i = 0; i<str.length(); i++) {
			ar[i] = str.charAt(i);
			if(ar[i]==ch) {
				count++;
			}
		}
		
		return count;
	}

}
