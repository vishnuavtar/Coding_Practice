package Exception;

class MyExceptionA extends Exception{
	
	MyExceptionA(String str){
		super(str);
	}
	
	
}

public class CustomeException1 {

	public static void main(String[] args) {
		
		try {
			throw new MyException(null)n;
		}catch(Exception e) {
			System.out.println(e.);
		}
	}
}
