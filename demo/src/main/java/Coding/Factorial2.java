package Coding;

public class Factorial2 {

	public int f1(int n) {
		if (n == 1) {
			return 1;
		} else {
			return (n * f1(n - 1));
		}
	}

	public static void main(String[] args) {
		
		Factorial2 f = new Factorial2();
		System.out.println(f.f1(5));

	}

}
