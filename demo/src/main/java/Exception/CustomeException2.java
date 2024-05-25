	package Exception;

//class MyException extends Exception{
//	
//	MyException(int i){
//		super(i);
//		
//		int a  = 10;
//		int b = 0;
//	}
//}

public class CustomeException2 extends MyException{

	CustomeException2(String s) {
		super(s);
		// TODO Auto-generated constructor stub
		
		
	}

	public static void main(String[] args) {
		int a  = 10;
		int b = 0;
		
		try {
			throw new MyException(a/b);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}

