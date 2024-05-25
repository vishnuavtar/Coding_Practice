package Singleton;

public class Singlton {
	
	private static Singlton instance=null;
	
	Singlton()
	{
		String s = "This is String";
	}
	
	Singlton GetMethod() {
		if(instance==null) {
			instance = new Singlton();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		Singlton ss = new Singlton();
		System.out.println(ss.GetMethod());
		
		
	}
}
