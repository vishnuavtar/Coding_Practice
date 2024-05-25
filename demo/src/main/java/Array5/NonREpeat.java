package Array5;

public class NonREpeat {
	
	public void f1(int a[], int n) {
		
		boolean[] visited = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			
			if(visited[i]==true) {
				continue;
			}
			
			int count=1;
			for(int j = 0; j<n; j++) {
				if(a[i]==a[j]) {
					visited[j] = true;
					
					count++;
				}
			}
			
			if(count==1) {
				System.out.println(a[i]);
			}
			
			
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,1,2,3,4};
		int n = a.length; 
		NonREpeat nn = new NonREpeat();
		nn.f1(a, n);
		
	}

}
