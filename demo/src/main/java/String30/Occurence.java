package String30;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character for count = ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch);
		System.out.println(ToOocurence(str,ch));
		
	}
	
	public static int ToOocurence(String str, char ch) {
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
