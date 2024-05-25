package CustomeExce;


class u extends Exception{
	
	u(String str){
		super(str);
	}
}

public class youth {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b)  throws u{
		
		if(b==0) {
			throw new u("Not allowed");
		}
		
		return a/b;
	}
}
