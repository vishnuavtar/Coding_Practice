package CustomeExce;


class cb extends Exception{
	
	cb(String str){
		super(str);
	}
}

public class Abc {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	public static int divide(int a, int b) throws cb {
		
		if(b==0) {
			throw new cb("not allowed");
		}
		
		return a/b;
	}
}
