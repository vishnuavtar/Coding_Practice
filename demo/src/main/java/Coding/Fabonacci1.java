package Coding;

public class Fabonacci1 {
	
	static int a = 0;
	static int b = 1;
	static int c = 3;
	
	
	public static void f1(int count) {
		if(count>0) {
		c  = a + b;
		a = b;
		b = a;
		
		System.out.println(" " + c);
		
		f1(count-1);
		}
	}
	
	public static void main(String[] args) {
		
		int count = 20;
		System.out.println(a + " " + b);
		f1(count-2);
		
	}
	

}
