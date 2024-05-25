package Array2;

public class DublicatePrint {
	
	public static void main(String[] args) {
		
		int a[] = {11,22,33,44,55,11,22,33};
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
 		
	}

}
