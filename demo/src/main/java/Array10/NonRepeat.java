package Array10;

public class NonRepeat {
	
	
	static void f1(int a[] , int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int find = 1;
			for(int j = i+1; j<n; j++ ) {
				if(a[i]==a[j]) {
					visited[j] = true;
					find++;
				}
			}
			
			if(find==1) {
				System.out.println(a[i]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3};
		
		int n = a.length;
		
		f1(a,n);
		
	}

}
