package Array;

public class NonDublicate {
	
	public static void main(String[] args) {
		
		boolean chk ; 
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4};
		
		for(int i = 0; i<a.length; i++) {
			chk = false;
			for(int j = i+1; j<a.length; j++) {
				if(i!=j && a[i]==a[j]) {
					chk = true;
					break;
				}
			}
			
			if(!chk) System.out.print(a[i] +"");
		}
		
		System.out.println("\n" + a.length);
	}

}
