package Singleton;

public class NewSinglton {
	
	private static NewSinglton instance = null;
	
	NewSinglton(){
		String str = "This is my job";
		//System.out.println(str);
	}
	
	public NewSinglton getMethod() {
		if(instance==null) {
			instance = new NewSinglton();
		}
		
		return instance;
	}
	

	public static void main(String[] args) {
		
		NewSinglton ss = new NewSinglton();
		System.out.println(ss.getMethod());
		
	}
}
