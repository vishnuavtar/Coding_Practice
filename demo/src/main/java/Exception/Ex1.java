package Exception;

 class MyException extends Exception{
	 
	 MyException(String s){
		 super(s);
	 }
	
}

public class Ex1 {
	
	public static void main(String[] args) {
		
		try {
			String s = null;
			throw new MyException(s);
		}catch(Exception e) {
			System.out.println("Error By" + e.getMessage());
		}
	}

}
