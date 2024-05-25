package Array32;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,9,44,66,22,11,88,66};
		
		for(int i = 0; i<a.length; i++) {
			
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
				int temp = a[i];
				 a[i] = a[j];
				  a[j] = temp;
 				
				}
			}
			
			System.out.print(a[i]+" ");
		}
		
	}

}
