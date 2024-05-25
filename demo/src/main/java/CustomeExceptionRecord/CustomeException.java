package CustomeExceptionRecord;


class MyException extends Exception{
	
	MyException(String str){
		super(str);
	}
}

public class CustomeException {

	public static void main(String[] args) {
		try {
			int n = divide(10,0);
			System.out.println("n =" + n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a, int b) throws MyException{
		
		if(b==0) {
			throw new MyException("not allowed");
		}
		
		return a/b;
	}
}
