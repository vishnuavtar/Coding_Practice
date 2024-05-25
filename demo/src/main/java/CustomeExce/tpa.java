package CustomeExce;

class tap extends Exception{
	
	tap(String str){
		super(str);
	}
}


public class tpa {
	
	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws pat {
		
		if(b==0) {
		 throw new pat("Not allowed");
		}
		return a/b;
	}

}
