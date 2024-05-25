package Coding;

public class Fabonacci {
	
	static int a = 0;
	static int b = 1;
	static int c = 2;
	
	static void f1(int count) {
		if(count>0) {
			c = a+b;
			a=b;
			b=c;
			System.out.print(" " + c);
			f1(count-1);
		}
	}
	
	public static void main(String[] args) {
		int count = 20;
		//Fabonacci f = new Fabonacci();
		System.out.println(a + " " + b);
		f1(count-2);
		
	}

}
