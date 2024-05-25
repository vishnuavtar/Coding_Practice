package Coding;

public class Prime5 {
	
	public static void main(String[] args) {
		
		int a = 97;
		boolean flage = false;
		
		for(int i = 0; i<a/2; i++) {
			if(a%2==0) {
				flage = true;
			}
		}
		
		if(!flage) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
	}

}
