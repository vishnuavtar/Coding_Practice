package nCodeIt2;

// Task7: Write a Java program to find the duplicate values of an array of integer values

public class FindDublicate {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,1,2,3,4};
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i] + " ");
				}
			}
		}
	}
}
