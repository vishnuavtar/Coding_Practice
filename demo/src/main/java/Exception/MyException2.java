package Exception;

public class MyException2 extends Exception{

	
	public MyException2(int a) {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		
		try {
			throw new MyException2(10/0);
		}catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
		
	}
}
