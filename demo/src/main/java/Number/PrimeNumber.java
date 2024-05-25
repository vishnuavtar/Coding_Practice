package Number;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args)  throws IOException{
		
		 
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number -- "); 
		int a = sc.nextInt();
		
		if(a==0 || a== 1 || a%2==0 || a%3==0 ||a%4==0 ||a%5==0 ||a%6==0 ||a%7==0 || a%8==0 ||a%9==0 || a==3|| a==5 || a==7 ){ 
			System.out.println("number is prime");
			
		}else {
			System.out.println("Not prime");
		}
		
	}

}
}