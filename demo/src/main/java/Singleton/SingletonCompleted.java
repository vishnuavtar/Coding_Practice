package Singleton;

public class SingletonCompleted {
	
	private static Singleton instance=null;
	
	Singleton(){
		String s = "This is my job";
	}
	
	public Singleton getMethod() {
		if(instance==null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String arg[]) {
		Singleton ss = new Singleton();
		System.out.println(ss.getMethod());
		System.out.println(ss.hashCode());
		
	}

}
