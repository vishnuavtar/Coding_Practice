package Number;

public class ReverseNumber2 {
	
	int rev;
	int rem;
	 
	public int f1(int n) {
		
		while(n>0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		
		return rev;
		
	}
	
	
	public static void main(String[] args) {
		
		ReverseNumber2 r = new ReverseNumber2();
		System.out.println(r.f1(1234));
		
	}

}
