package Number;

public class ReverseNumber {
	
	int rem;
	int rev;
	int n;
	
	public int f1(int n) {
	
		while(n>0) {
			
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
			
		}
		
		return rev;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		ReverseNumber r = new ReverseNumber();
		System.out.println(r.f1(1234));
		
		
		
		
	}

}
