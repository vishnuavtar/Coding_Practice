package Coding;

public class Pri {
	
	public static void main(String[] args) {
		
		
		int a = 97;
		boolean flage = false;
		for(int i = 2; i<a/2; i++) {
			if(a%2==0) {
				flage = true;
			}
		}
		
		if(!flage) {
			System.out.println("Prime number");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}

}
