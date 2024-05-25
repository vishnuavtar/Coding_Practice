package Exception;

class MyException extends Exception {

	public MyException() {
		super();
	}
}

public class E1 {

	public static void main(String[] args) {

		try {
			throw new MyException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
