package Array39;

public class ArraySort {

	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,1,7,8,9,43,5,7,3322,13,45};
		
		for(int i = 0; i<a.length; i++) {
			
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.println(a[i] + " ");
		}
	}
	
}
