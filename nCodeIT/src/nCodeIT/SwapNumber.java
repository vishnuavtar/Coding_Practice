package nCodeIT;

public class SwapNumber {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int c;
		
		System.out.println("Before Swapping" + " a = " +a + " , " + "b = " + b);
		
		c = a;
		a = b;
		b = c;
		
		
		System.out.println("After Swapping "+"a = " + a + " , "+ "b = " + b);
	}

}
