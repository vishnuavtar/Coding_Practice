package Array;

public class NonReapet {
	
	public void f1(int ar[], int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int  count= 1;
			for(int j = i+1; j<n; j++) {
				if(ar[i]==ar[j]) {
					visited[j]=true;
					count++;
				}
			}
			
			if(count==1) {
				System.out.print(ar[i]);
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int ar[] = {1,2,3,4,5,1,2,3,4,5,6,7,8,9};
		int n = ar.length;
		NonReapet nn = new NonReapet();
		nn.f1(ar, n);
		
		
	}

}
