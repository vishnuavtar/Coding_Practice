package Array10;

public class PrintSingle {
	
	public static void main(String[] args) {
	
		boolean chk;
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8};
		
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					chk = true;
					continue;
				}
			}
			
			System.out.println(a[i]);
		}
		
	}

}
