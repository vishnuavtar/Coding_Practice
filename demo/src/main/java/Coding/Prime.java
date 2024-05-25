package Coding;

public class Prime {
	
	public static void main(String[] args) {
		
		int n = 97;
		boolean flage = false;
		for(int i = 2; i<n/2; i++) {
			
			if(n%2==0) {
			flage = true;
			break;
		}
		}
		if(!flage) {
			System.out.println("Prime");
		}else {
			System.out.println("Not");
		}
	}

}
