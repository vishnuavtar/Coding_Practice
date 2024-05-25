package Array28;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,8,9,2,5,78,400,100};
		
		for(int i  = 0; i<ar.length; i++) {
			
			for(int j = i+1; j<ar.length; j++) {
				
				if(ar[i]>ar[j]) {
					int temp =  ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			
			System.out.print(ar[i] + " ");
		}
		
		
	}

}
