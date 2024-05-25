package Coding;

public class Prime12 {
	
	public static void main(String[] args) {
		
		
		int a = 97;
		boolean flage = false;
		
		for(int i = 0; i<100; i++) {
			if(a%2==0) {
				flage = true;
			}
		}
		if(!flage) {
			System.out.println("Prime");
		}else {
			System.out.println("Not");
		}
	}

}
