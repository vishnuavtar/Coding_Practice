package Array24;

public class ArraySort {
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,1,2,3,3,5,6,7,8,9};
		
		for(int i = 0; i<a.length; i++) {
			
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
			}
			
			System.out.print(a[i] +  " ");
		}
		
	}

}
