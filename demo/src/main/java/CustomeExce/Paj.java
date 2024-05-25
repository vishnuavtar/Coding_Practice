
package CustomeExce;

class jap extends Exception{
	
	jap(String str){
		super(str);
	}
}

public class Paj {
	
	public static void main(String[] args) {
		
		try {
			int n = divide(10,0);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}
	
	public static int divide(int a,int b) throws jap {
		
		if(b==0){
			throw new jap("Not Allowed");
		}
		
		return a/b;
	}

}
