package Exception;

import ArrayArray1sub.exception_handling;

class MyException extends Exception{
	
	public MyException(int x, int y) {
	int a = x;
	int b = y;
	
	int c = a/b;
	
	System.out.println(c);
	}
}



public class Cus {
	
	public static void main(String[] args) {
		
		try {
			
			throw new MyException(10, 0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
