package Coding;

public class Factorial21 {
	
	public static int f1(int a) {
		
		if(a==1) {
			return 1;
		}else {
			return a*f1(a-1);
		}
	}
	
	public static void main(String[] args) {
		
		int a = 5;
		
		System.out.println(f1(a));
		
	}

}
