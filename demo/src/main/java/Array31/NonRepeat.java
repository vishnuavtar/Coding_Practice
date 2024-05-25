package Array31;

public class NonRepeat {

	
	public static void main(String[] args) {
		
		int a[]= {1,9,5,8,2,5,4,23,98,123,11};
		
		boolean chk;
		
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = 0; j<a.length; j++) {
				
				if(i!=j && a[i]==a[j]) {
					chk = true;
					break;
				}
			}
			
			if(!chk) {
				System.out.print(a[i] +  " ");
			}
		}

		
	}
}
