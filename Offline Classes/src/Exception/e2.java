package Exception;

public class e2 {
	
	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 0;
		int c;
		try {
			c = a/b;
		}catch(ArithmeticException ae) {
			System.out.println("Arithmetic Occured");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
