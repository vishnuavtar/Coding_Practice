package CustomeExce;


class pat extends Exception{
	
	pat(String str){
		super(str);
	}
}

public class tap {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public static int divide(int a, int b) throws pat{
		
		if(b==0) {
			throw new pat("Not allowed");
		}
		
		return a/b;
	}
}
