package String48;

import java.util.Scanner;

public class CountAlphaDiCha {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int digit=0;
		int sp=0;
		int cha = 0;
		
		char ch;
		
		for(int i = 0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
				cha++;
			}else if(ch>='0' && ch<='9') {
				digit++;
			}else {
				sp++;
			}
		}
		
		System.out.println(cha);
		System.out.println(digit);
		System.out.println(sp);
	}

}
