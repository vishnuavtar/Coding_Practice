package Singleton;

public class SIngleton3 {
	
	private static SIngleton3 instance =null;
	
	SIngleton3(){
		String str = "This is my job";
	}
	
	SIngleton3 getMethod() {
		if(instance==null) {
			instance= new SIngleton3();
		}
		
		return instance;
	}
	
	public static void main(String[] args) {
		
		SIngleton3 ss = new SIngleton3();
		
		
		System.out.println(ss.getMethod());

	}

}
