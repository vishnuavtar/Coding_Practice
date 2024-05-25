package Exception;

 class MyException  extends Exception{
	
	MyException(int a){
		
		System.out.println(a);
		
	}
}

public class c1 {

	
	public static void main(String[] args) {
		
		
		try {
			throw new MyException(10/0);
		}catch(Exception e) {
			System.out.println("Error " + e.getMessage());
		}
		
	}
}
