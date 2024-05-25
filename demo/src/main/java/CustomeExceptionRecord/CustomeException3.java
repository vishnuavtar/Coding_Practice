package CustomeExceptionRecord;


class CustomeException32 extends Exception{
	
	CustomeException32(String str){
		super(str);
	}
}

public class CustomeException3 {

	public static void main(String[] args) {
		
		try {
			int n =  divide(10,0); 
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int divide(int a, int b) throws CustomeException32 {
		
		if(b==0) {
			throw new CustomeException32("Not Allowed");	
			}
		
		return a/b;
	}
}
