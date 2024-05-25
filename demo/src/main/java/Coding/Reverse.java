package Coding;

public class Reverse {
	
	int rem;
	int rev;
	
	public int f1(int a) {
		while(a>0) {
			rem = a%10;
			rev = rev*10+rem;
			a  = a/10;
		}
		
		return rev;
	}
	
	public static void main(String[] args) {
		Reverse r = new Reverse();
		System.out.println(r.f1(12345));
		
	}

}
