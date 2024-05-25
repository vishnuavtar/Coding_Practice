package Exception;


class  MyException extends Exception{
	
	MyException(int s){
		s = 10/0;
	}
}

public class CustomeException {

	public static void main(String[] args) {
		
		int s=0;
		
		try {
			throw new MyException(s);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
