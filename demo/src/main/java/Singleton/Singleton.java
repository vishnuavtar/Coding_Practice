package Singleton;

public class Singleton {
	
	private static Singlton instance = null;

	
	Singleton(){
		String str = "This is my String";
	}
	
	Singlton getMethod() {
		if(instance==null) {
			instance = new Singlton();
		}
		
		return instance;
	}
	
	
	public static void main(String[] args) {
		
		
		Singlton ss = new Singlton();
		System.out.println(ss.GetMethod());
		System.out.println(ss.hashCode());
		
	}
	
}
