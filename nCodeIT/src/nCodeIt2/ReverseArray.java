package nCodeIt2;

//Task6: Write a Java program to reverse an array of integer values

public class ReverseArray {

	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10};
		
	
		for(int i = a.length-1; i>=0; i--) {
			System.out.print(a[i] + " ");
		}
		
	}
}
