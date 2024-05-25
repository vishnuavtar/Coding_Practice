package Singleton;

public class Singleton4 {
	
	private static Singleton instance=null;
	
	Singleton4(){
		String s = "This is my job";
	}
	
	public Singleton4 getMethod() {
		if(instance==null) {
			instance = new Singleton4();
		}
		return instance;
		
		
	}
	
	public static void main(String[] args) {
		Singleton4 ss = new Singleton4();
		System.out.println(ss.getMethod());
	}

}
