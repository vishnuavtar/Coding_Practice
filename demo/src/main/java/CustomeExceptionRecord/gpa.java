package CustomeExceptionRecord;

class gap extends Exception{
	
	gap(String str){
		super(str);
	}
}

public class gpa {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws gap {
		
		if(b==0) {
			throw new gap("not allowed");
		}
		
		return a/b;
	}
}
