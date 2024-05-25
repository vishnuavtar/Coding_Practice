package Array39;

public class Dublicate {
	
	public static void main(String[] args) {
		
		int b[] = {1,2,3,1,7,8,9,43,5,7,3322,13,45,54,54};
		
		for(int i = 0; i<b.length; i++) {
			
			for(int j = i+1; j<b.length; j++) {
				
				if(b[i]==b[j]) {
					System.out.println(b[i]);
				}
			}
		}
	}

}
