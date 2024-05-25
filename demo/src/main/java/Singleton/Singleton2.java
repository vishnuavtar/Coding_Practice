package Singleton;

public class Singleton2 {

	private static Singleton2 instance = null;

	Singleton2() {
		String s = "This is my job";
		System.out.println(s);
	}

	Singleton2 getMethod() {
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
		
	}

	public static void main(String[] args) {
		
		Singleton2 x = new Singleton2();
		System.out.println(x.getMethod());
		
	}
}
