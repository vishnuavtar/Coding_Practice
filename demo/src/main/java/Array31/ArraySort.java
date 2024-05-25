package Array31;

public class ArraySort {
	
public static void main(String[] args) {
	
	int a[]= {1,9,5,8,2,5,4,23,98,123,11};
	
	for(int i = 0; i<a.length; i++) {
		
		for(int j = i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
				int temp = a[i];
				a[i]  = a[j];
				a[j] = temp;
			}
		}
		
		System.out.print(a[i] + " ");
	}

}
}
