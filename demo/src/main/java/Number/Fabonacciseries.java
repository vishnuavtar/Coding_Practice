package Number;

public class Fabonacciseries {

	public static int a = 0;
	public static int b = 1;
	public static int c = 2;

	public static int f1(int count) {

		
		if (count > 0) {
			c = a + b;
			a=b;
			b=c;
			
			System.out.print( " " + c);
			
			f1(count-1);
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		int count=20;
		System.out.print(a + " " + b);
		f1(count-2);
		
	}

}
