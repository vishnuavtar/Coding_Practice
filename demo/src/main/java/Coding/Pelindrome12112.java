package Coding;

public class Pelindrome12112 {
	
	public static void main(String[] args) {
		
		int rem ;
		int rev = 0;
		int n = 111;
		int temp = n;
		
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		
		if(rev==temp) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not");
		}
	}

}
