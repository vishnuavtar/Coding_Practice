package Coding;

public class Factorial {
	
	public int f1(int a) {
		if(a==1) {
			return 1;
		}else {
			return (a* f1(a-1));
		}
	}
	
	public static void main(String[] args) {
		
		Factorial f = new Factorial();
		System.out.println(f.f1(5));
		
	}

}
