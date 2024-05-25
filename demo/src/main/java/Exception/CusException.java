package Exception;

 class MyException extends Exception{
	 public MyException(String s) {
		// TODO Auto-generated constructor stub
		 s = "This is my job";
	}
	 
	
}

public class CusException {
	
	public static void main(String[] args) {
		
		try {
			throw new MyException("fine");
		}catch(Exception e) {
			System.out.println("Error by " + e.getMessage());
			
		}
	}

}
