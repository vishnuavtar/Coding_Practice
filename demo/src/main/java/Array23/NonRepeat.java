package Array23;

public class NonRepeat {
	
	public static void f1(int a[], int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<a.length; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			
			int find = 0;
			for(int j = 0; j<=i; j++) {
				
				if(a[i]==a[j]) {
					find++;
				}
			}
			
			if(find==1) {
				System.out.println(a[i]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5,6,7,8,6,1,2,3,4,6,7,54,32,21,12,54,103};
		int n = a.length;
		f1(a,n);
		
		
		
	}

}
