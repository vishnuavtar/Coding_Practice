package Coding;

public class PrimeNum {
	
	public static void main(String[] args) {
		
		
		int a  = 900;
		boolean flage = false;
		
		for(int i = 2; i<a/2; i++) {
			
			if(a%2==0) {
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
