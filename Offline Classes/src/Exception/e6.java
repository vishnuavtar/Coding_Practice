package Exception;

public class e6 {

	public static void square(int num) {
		
		if(num<0) {
			throw new ArithmeticException("Arithmetic exception Occured");
		}else {
			System.out.println(num*num);
		}
	}
	
	
	public static void main(String[] args) {
		
		square(-4);
	}
}
