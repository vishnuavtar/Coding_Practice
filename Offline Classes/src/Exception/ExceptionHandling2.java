package Exception;

// Task2: Create a class inside the try block declare an array a[] and initialize with value a[5] =30/5;In each catch block show Arithmetic exception and ArrayIndexOutOfBoundsException.

public class ExceptionHandling2 {

	public static void main(String[] args) {

		try {

			int a[] = new int[5];
			a[5] = 30 / 5;
		} catch (ArithmeticException e) {

			System.out.println("ArithmeticException occurs");
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(" ArrayIndexOutOfBoundsException occurs");
		} catch (Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}
}
