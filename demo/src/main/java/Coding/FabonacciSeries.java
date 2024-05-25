package Coding;

public class FabonacciSeries {
	
	static int a=0;
	static int b = 1;
	static int c = 2;
	
	static int f1(int n) {
		
		if(n>0) {
			c = a+b;
			a=b;
			b=c;
			
			System.out.println( " " + c);
			f1(n-1);
		}
		
		return n;
	}
	

	public static void main(String[] args) {
		int n  = 20;
		System.out.println(a +  " " + b);
		f1(n-2);
	}
}
