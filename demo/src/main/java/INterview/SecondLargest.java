package INterview;

public class SecondLargest {
	
	public static int f1(int a[], int total) {
		
		for(int i = 0; i<total; i++) {
			for(int j = i+1; j<total; j++) {
				
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(f1(a,10));
		
	}

}
