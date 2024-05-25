package CustomeExce;


class jp extends Exception{
	
	jp(String str){
		super(str);
	}
}

public class Taj {

	
	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a, int b) throws jp {
		
		if(b==0) {
			throw new jp("not Allowed");
		}
		
		return a/b;
	}
}
