package Array;

public class RemoveDublicate {
	
	public static void main(String args[]) {
		
		int ar[]  = new int[256];
		
		int a[] = {1,2,3,4,5,6,6};
		for(int i = 0; i<a.length; i++ ) {
			for(int j = i+1; j<256; j++) {
				if(a[i]==a[j]) {
				System.out.print(a[i]);	
				}
			}
		}
	}

}
