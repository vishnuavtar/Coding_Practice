package Coding;

public class pri2 {
	
	public static void main(String[] args) {
		
		int a = 97;
		boolean flage = false;
		for(int i = 0; i<a/2; i++) {
			if(a%2==0) {
				flage = true;
			}
		}
		
		if(!flage) {
			System.out.println("prime number");
		}else {
			System.out.println("Not Prime");
		}
		
	}

}
