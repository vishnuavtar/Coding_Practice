package Array;

import java.util.Scanner;

public class Squarearray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int square=0;
		
		System.out.println("How many elements you want to enter: ");
		int lim = sc.nextInt();
		int[] arr= new int[lim];
		
		System.out.println("Enter "+lim+" elements: ");
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			square = arr[i]*arr[i];
			System.out.println("Square of "+ arr[i] +" is: "+square);
	    }

	}
}
