package CustomeExce;

class bc extends Exception{
	
	bc(String str){
		super(str);
	}
}

public class bcdq {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int divide(int a,int b) throws bc {
		
		if(b==0) {
			throw new bc("Not Allowed");
		}
		
		return a/b;
	}
}
