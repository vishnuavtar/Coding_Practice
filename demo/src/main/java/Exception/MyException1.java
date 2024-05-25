package Exception;

public class MyException1 extends Exception {

	public MyException1(int s) {

		System.out.println(s);
	}
	
	public static void main(String[] args) {
	
		try {

			throw new MyException1(10/0);
		} catch (MyException1 ex) {
			System.out.println("Caught");

			System.out.println(ex.getMessage());
		}
	}
}
