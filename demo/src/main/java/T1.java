
public class T1 extends Thread {

	public void run() {
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		T1 obj1 = new T1();
		obj1.start();
		
	}
	
	
}
