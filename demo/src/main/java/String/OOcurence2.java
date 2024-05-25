package String;

import java.util.Scanner;

public class OOcurence2 {
	
	public static void main(String[] args) {
		
		
		String str = "This is My job";
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println(ch);
		System.out.println(ToCount(str,ch));
		
	}
	
	public static int ToCount(String str, char ch) {
		int count=0;
		int ar[] = new int[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ar[i]=str.charAt(i);
			if(ar[i]==ch) {
				count++;	
			}
		}
		
		return count;
	}

}
