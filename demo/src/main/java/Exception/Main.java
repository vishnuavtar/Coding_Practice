package Exception;

class MyException extends Exception {
	public MyException(String s) {

		super(s);
	}
}

public class Main {

	public static void main(String args[]) {
		try {

			throw new MyException("GeeksGeeks");
		} catch (MyException ex) {
			System.out.println("Caught");

			System.out.println(ex.getMessage());
		}
	}
}
