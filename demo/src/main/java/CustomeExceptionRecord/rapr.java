package CustomeExceptionRecord;


class pr extends Exception{
	
	pr(String str){
		super(str);
	}
}

public class rapr {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a, int b) throws pr{
		if(b==0) {
			throw new pr("Not allowed");
		}
		
		return a/b;
	}
}
