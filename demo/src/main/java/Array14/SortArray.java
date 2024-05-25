package Array14;

public class SortArray {
	
	static void f1(int a[]) {
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,89,1,2,3,4};
		f1(a);
		
	}

}
