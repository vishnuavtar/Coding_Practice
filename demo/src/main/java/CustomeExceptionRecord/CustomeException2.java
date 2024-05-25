package CustomeExceptionRecord;

class MyException extends Exception {

	MyException(String str) {
		super(str);
	}
}

public class CustomeException2 {
	public static void main(String[] args) {
		
		try {
			int result =  divide(20,0);
			System.out.println("result" + result);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws MyException {
		if(b==0) {
			throw new MyException("Not Allowed");
		}
		
		return a/b;
	}
	
	
}
