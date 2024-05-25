package CustomeExce;

class ipa extends Exception{
	
	ipa(String str){
		super(str);
	}
}

public class pai {

	
	public static void main(String[] args) {
		
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	public static int divide(int a , int b) throws ipa {
		
		if(b==0) {
			
			throw new ipa("Not Allowed"); 
		}
		
		return a/b;
	}
}
