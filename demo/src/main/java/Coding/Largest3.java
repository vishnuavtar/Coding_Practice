package Coding;

public class Largest3 {
	
	
	public static int f1(int n[], int total) {
		
		for(int i = 0; i<n.length; i++) {
			for(int j = i+1; j<n.length; j++) {
				if(n[i]>n[j]) {
					int temp =n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
			
			
		}
		
		return n[total-2];
	}
	
	public static void main(String[] args) {
		
		int n[] = {1,2,3,4,5,6,7,8,9};
		System.out.println(f1(n,9));
	}

}
