package Number;

public class reverseNiumber {
	
	
	public static void main(String[] args) {
		
		int rem;
		int rev = 0;
		int n=12345;
		
		int temp = n;
		
		while(n>0) {
			
			rem = n%10;
			rev = rem + rev*10;
			n  = n/10;
			
		}
		
		System.out.println(rev);
		
		if(temp == rev) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not Pelindrome");
		}
	}

}
