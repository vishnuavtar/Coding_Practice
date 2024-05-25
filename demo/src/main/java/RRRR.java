
public class RRRR {
	
	public static void main(String[] args) {
		
		
		int n = 1112;
		
		int rev=0;
		int rem;
		
		int temp = n;
		while(n>0) {
			
			rem = n%10;
			rev = (rev*10)+rem;
			n=n/10;
		}
		
		
		if(temp==rev) {
			System.out.println("Pelindrome");
		}else {
			System.out.println("Not");
		}
		
	}

}
