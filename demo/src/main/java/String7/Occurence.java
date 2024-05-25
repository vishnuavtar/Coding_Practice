package String7;

import java.util.Scanner;

public class Occurence {
	
	public static void main(String[] args) {
		
		
		String str = "This is my job";
		
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		System.out.println(ch);
		System.out.println(ToOccure(str,ch));
	}
	
		public static int ToOccure(String str, char ch) {
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
