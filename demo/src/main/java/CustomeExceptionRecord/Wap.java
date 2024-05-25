package CustomeExceptionRecord;

class wep extends Exception{
	 
	wep(String str){
		super(str);
	}
}

public class Wap {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a, int b) throws wep{
		if(b==0) {
			throw new wep("Not allowed");
		}
		
		return a/b;
	}
}
