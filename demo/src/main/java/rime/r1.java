package rime;

import java.util.Scanner;

public class r1 {

	
	public static void main(String[] args) {
		
		
		boolean flage = false;
		System.out.println("Enter number to check prime");
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		
		
		
		for(int i = 2; i<a/2; i++) {
			
			if(a%2==0) {
				flage = true;
				break;
			}
		}
		
		if(!flage) {
			System.out.println("Prime NUmber");
		}else {
			System.out.println("Not Prime Number");
		}
		
	}
}
