package Array12;

public class NonRepeat {
	
	
	static int f1(int a[], int n)
	{
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int count = 1;
			
			for(int j = i+1; j<n; j++) {
				if(a[i]==a[j]) {
					visited[j]  =true;
					count++;
				}
			}
			
			if(count==1) {
				System.out.println(a[i]);
				
			}
		}
		return n;
		
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,1,2,3};
		
		int n = a.length;
		
		f1(a,n);
	}

}
