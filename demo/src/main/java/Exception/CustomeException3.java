package Exception;

class myException extends Exception{
	
	public myException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
	}
}

public class CustomeException3 {

	
	public static void main(String[] args) {
		
		
		int s = 10/0;
		
		try {
			throw new myException(10);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
