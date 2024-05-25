package Singleton2;

public class Singleton {
	
	private static Singleton instance = null;
	
	public Singleton() {
		String str = "This is a city";
	}
	
	Singleton getMethod() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args) {
		
		Singleton ss = new Singleton();
		System.out.println(ss.getMethod());
		
		System.out.println(ss.hashCode());
		
	}

}
