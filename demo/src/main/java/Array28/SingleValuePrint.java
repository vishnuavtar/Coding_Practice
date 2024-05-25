package Array28;

public class SingleValuePrint {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,2,1,2,3,4,56,7,8,8};
		
		boolean chk;
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = i+1; j<a.length; j++) {
				if(1!=j && a[i]==a[j]) {
					chk = true;
					continue;
				}
			}
			
			if(!chk) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
