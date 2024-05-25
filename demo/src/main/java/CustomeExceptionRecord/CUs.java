package CustomeExceptionRecord;


class cas extends Exception{
	
	cas(String str){
		super(str);
	}
}

public class CUs {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws cas {
		
		if(b==0) {
			throw new cas("not allowed");
		}
		
		return a/b;
	}
}
