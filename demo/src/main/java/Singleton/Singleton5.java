package Singleton;

public class Singleton5 {

	private static Singleton5 instance = null;
	
	Singleton5(){
		String s = "This is my job";
	}
	
	Singleton5 getMethod() {
		if(instance==null) {
			instance = new Singleton5();
		}
		return instance;
		
	}
	
	public static void main(String[] args) {
		
	
		Singleton5 ss = new Singleton5();
		System.out.println(ss.getMethod());
	}
}
