package Coding;

public class SecondLargest10 {
	
	
	public static int f1(int a[], int total) {
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp  =a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			
		}
		
		return a[total-2];
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,4,56,6,7,9};
		int b  =a.length;
		System.out.println(f1(a,b));
		
	}

}
