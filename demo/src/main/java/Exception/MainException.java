package Exception;


class MyException12 extends Exception{
	
	MyException12(){
		
	}
}

public class MainException {

	public static void main(String[] args) {
		
		try {
			throw new MyException12(" ");
		}catch(Exception e) {
			System.out.println(e.);
		}
		
	}
}
