package rime;

public class Penidrome1 {
	
	public static void main(String[] args) {
		
		int a = 1111;
		int temp = a;
		
		int rev=0;
		int rem;
		
		while(a>0) {
			rem = a%10;
			rev = rev*10+rem;
			a = a/10;
		}
		
		System.out.println(rev);
		
		if(rev==temp) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
	}

}
