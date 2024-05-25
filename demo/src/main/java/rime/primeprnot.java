package rime;

public class primeprnot {

	public static void main(String[] args) {

		int a = 97;
		boolean b = false;

		for (int i = 2; i < a / 2; i++) {
			if(a%2==0) {
				b = true;
			}
		}
		
		if(!b) {
			System.out.println("This is prime number");
		}else {
			System.out.println("Not prime number");
		}
	}

}
