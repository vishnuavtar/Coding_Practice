package demo;

public class abc {
	
	public void f1(int a[]) {
		
		boolean chk;
		
		for(int i = 0; i<a.length; i++) {
		
			chk = false;
			
			for(int j = i+1; j<a.length; j++) {
				
				if(i!=j&&a[i]==a[j]) {
					chk = true;
					break;
				}
			}
			
			if(!chk) System.out.print(a[i] + "");
		}
		
		
	}
	

	public static void main(String[] args) {
		int a[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,8};
		abc ab = new abc();
		ab.f1(a);
	}
	
}
