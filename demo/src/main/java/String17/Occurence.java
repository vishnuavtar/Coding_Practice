package String17;

import java.util.Scanner;

public class Occurence {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter String  : -");
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter cahracter : -");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch);
		System.out.println(ToOccurence(str,ch));
	}
	
	
	public static int ToOccurence(String str, char ch) {
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
