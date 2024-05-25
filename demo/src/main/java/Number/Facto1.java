package Number;

public class Facto1 {
	
	public static int f1(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*f1(n-1);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(f1(5));
		
	}

}
