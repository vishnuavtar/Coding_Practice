package Number;

public class Fabo3 {

	public static int a = 0;
	public static int b = 1;
	public static int c = 2;

	public static void f1(int n) {
		
		
		if(n>0) {
			c = a+b;
			a=b;
			b=c;
			
			System.out.print(" " + c);
			f1(n-1);
			
		}
		
	}

	public static void main(String[] args) {

		int n = 20;
		
		System.out.println(a + " " + b);
		
		f1(n-2);
	}
}
