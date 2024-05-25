package rime;

public class Pelindrome {
	
	public static void main(String[] args) {
		
		int a = 2113;
		int rev=0;
		int rem;
		
		int temp = a;
		while(a>0) {
			rem = a%10;
			rev = rev*10+rem;
			a=a/10;
		}
		
		System.out.println(rev);
		
		if(rev==temp) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not");
		}
		
		
	}

}
