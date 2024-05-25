
public class T2 implements Runnable {

	public void run() {
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		T2 obj = new T2();
		
		Thread tt = new Thread(obj);
		
		tt.start();
	}

	
}
