package Singleton;

public class Animal {
	
	private static Animal instance = null;
	
	Animal(){
		String str = "This is String";
	}
	
	public Animal getMethod() {
		if(instance==null) {
			instance = new Animal();
		}
		
		return instance;
	}

	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		
		System.out.println(a.getMethod());
		System.out.println(a.hashCode());
		
	}
}
