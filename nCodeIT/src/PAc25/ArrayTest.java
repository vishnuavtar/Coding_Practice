package PAc25;

// Task1: Write a Java program to find the maximum and minimum value of an array.

public class ArrayTest {

	
	public static void main(String[] args) {
		
		int[] my_array = {25,14,56,15,36,56,77,18,29,49};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i<=9; i++) {
			
			
			if(my_array[i]<min) {
				min = my_array[i];
			}
			
			if(my_array[i]>max) {
				max = my_array[i];
			}
		}
		
		System.out.println("Max element = " + max);
		System.out.println("Min element is = " + min);
	}
}
