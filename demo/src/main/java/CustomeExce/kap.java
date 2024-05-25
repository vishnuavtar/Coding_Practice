package CustomeExce;


class pak extends Exception{
	
	pak(String str){
		super(str);
	}
}

public class kap {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public static int divide(int a, int b) throws pak {
		if(b==0) {
			throw new pak("Not Allowed");
		}
		
		return a/b;
	}
}
