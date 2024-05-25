package CustomeExce;

class ff extends Exception{
	
	ff(String str){
		super(str);
	}
}

public class prf {

	
	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int divide(int a, int b) throws ff{
		
		if(b==0) {
			throw new ff("not allowed");
		}
		
		return a/b;
	}
}
