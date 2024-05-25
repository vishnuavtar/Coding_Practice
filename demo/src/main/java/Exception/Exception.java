package Exception;

public class MyException extends Exception{
	
	MyException(String s){
		s = "This is String";
	}
}

public class Exception {

	public Exception(String str) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	try {
		throw MyException("NUll");
	}catch(Exception e) {
		
	}
		
	}
}
