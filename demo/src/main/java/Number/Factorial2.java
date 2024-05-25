package Number;

public class Factorial2 {
	
	static int f1(int n) {
		if(n==1) {
			return 1;
		}else {
			return(n*f1(n-1));
		}
	}
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.println(f1(n));
	}

}
