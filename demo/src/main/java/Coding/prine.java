package Coding;

public class prine {

	public static void main(String[] args) {
		
		int  a = 97;
		Boolean flage = false;
		for(int i = 0; i<a/2; i++) {
			if(a%2==0) {
				flage = true;
				break;
			}
		}
		
		if(!flage) {
			System.out.println("prime number");
		}else {
			System.out.println("Not Prime number");
		}
		
	}
	
}
