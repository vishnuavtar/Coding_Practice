package Singleton1;

public class Singleton {
	
	private static Singleton instance = null;
	
	Singleton(){
		String str = "This is String";
	}
	
	Singleton getMethod() {
		if(instance==null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		Singleton ss = new Singleton();
		System.out.println(ss.hashCode());
	}

}
