package Array55;

public class SingleValePrint {
	
	public static void main(String[] args) {
		
		   int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6};

		   	boolean chk;
		   	
		   	for(int i = 0; i<a.length; i++) {
		   		chk = false;
		   		for(int j = i+1; j<a.length; j++) {
		   			if(a[i]>a[j]) {
		   				int temp = a[i];
		   				a[i] = a[j];
		   				a[j] = temp;
		   			}
		   		}
		   		
		   		System.out.println(a[i] + " ");
		   	}
	}

}
