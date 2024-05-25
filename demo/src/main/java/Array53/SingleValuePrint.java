package Array53;

public class SingleValuePrint {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,77,8,1,2,3};
		
		boolean chk;
		
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = i+1; j<a.length; j++) {
				if(i!=j && a[i]==a[j]) {
					chk = true;
				}
			}
			
			if(!chk) {
				System.out.println(a[i] + " ");
			}
		}
	}

}
