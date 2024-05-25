package Exception;

class pah extends Exception{
	
	pah(String str){
		super(str);
	}
}

public class hap {

	public static void main(String[] args) {
	
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static int divide(int a,int b) {
		if(b==0) {
			throw new pah("not allowed");
		}
		
		return a/b;
	}
}
