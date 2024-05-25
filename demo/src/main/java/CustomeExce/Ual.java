package CustomeExce;


class la extends Exception{
	
	la(String str){
		super(str);
	}
}

public class Ual {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws la {
		if(b==0) {
			throw new la("not allowed");
		}
		
		return a/b;
	}
}
