package Exception;

 class MyException4 extends Exception{
	
	MyException4(int a){
		System.out.println(a);
	}
	
}

public class CustomExceptionforUSe {

	
	public static void main(String[] args) {
		
		try {
			throw new MyException4(10/0);
		}catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
	}
}
