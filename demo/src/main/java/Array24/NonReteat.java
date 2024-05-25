package Array24;

public class NonReteat {

	public static void f1(int a[], int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<a.length; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int find = 0;
			
			for(int j = 0; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					find++;
				}
			}
			
		if(find==1) {
			System.out.print(a[i] + " ");
		}
		}
	}
	
	
	public static void main(String[] args) {
		
		int a[] = {1,2,7,3,4,4,5,6,7,5,1,2,3,445,2,6,6443};
		
		int n = a.length;
		
		f1(a,n);
	}
	
}
