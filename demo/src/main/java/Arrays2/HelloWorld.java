package Arrays2;

import java.io.IOException;
import java.util.*;
class HelloWorld {
    
	public int f1(int a[], int total) {
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
		
		int[] a = { 1, 1, 2, 2, 3, 34, 4, 44, 4,44, 56, 56,56,7, 8 };
		HelloWorld l = new HelloWorld();
		System.out.println(l.f1(a, 12));
		
		
	}

}