package Coding;

public class Fabonacci3 {
	
	static int a = 0;
	static int b = 1;
	static int c = 2;
	
	public static void f1(int n) {
		
		if(n>0) {
			
			c = a+b;
			a = b;
			b = c;
			
			System.out.print(" " + c);
			f1(n-1);
		}
	}

	public static void main(String[] args) {
		int n  = 10;
		System.out.print(a + " " + b);
		f1(n-2);
	}
	
	
}
