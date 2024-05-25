package CustomeExceptionRecord;

class paj extends Exception{

	paj(String str){
		super(str);
	}
}

public class jap {

	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int divide(int a,int b) throws paj {
		
		if(b==0) {
			throw new paj("Not Allowed");
		}
		
		return a/b;
	}
}
