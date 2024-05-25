package Singleton;

public class Singleton1 {
	
        static Singleton1 instance=null;
	
	Singleton1(){
		String str = "This is my job";
	}
	
	Singleton1 getMethod() {
		if(instance==null) {
			instance=new Singleton1();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		Singleton1 ss = new Singleton1();
		System.out.println(ss.getMethod());
		
	}

}
