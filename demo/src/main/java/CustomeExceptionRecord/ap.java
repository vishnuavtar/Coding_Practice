package CustomeExceptionRecord;

class ap2 extends Exception{
	
	ap2(String str){
		super(str);
	}
}


public class ap {

	
	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws ap2 {
		if(b==0) {
			throw new ap2("not allowed");
		}
		
		return a/b;
	}
}
