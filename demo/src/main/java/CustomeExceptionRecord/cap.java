package CustomeExceptionRecord;

class pac extends Exception{
	
	pac(String str){
		super(str);
	}
}

public class cap {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws pac {
		if(b==0) {
			throw new pac("Not Allowed");
		}
		
		return a/b;
	}
}
