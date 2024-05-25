package Array3;

public class NonRepeat {
	
	public void f1(int a[], int n) {
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int count = 1;
			for(int j = i+1; j<n; j++) {
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
		
		
		int[] a = {1,2,3,4,1,2,3,4,5,6,7,8,9};
		
		int n = a.length;
		
		NonRepeat nn = new NonRepeat();
		nn.f1(a, n);
		
		
	}

}
