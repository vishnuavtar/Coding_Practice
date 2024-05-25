package Array;

public class NonREapet2 {
	
	public void f1(int arr[], int n) {
	
		
		boolean visited[] = new boolean[n];
		
		for(int i = 0; i<n; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int count=1;
			for(int j = i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			
			if(count==1) {
				System.out.print(arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		
	int arr[] = {1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,8};
	int n = arr.length;
	NonREapet2 e = new NonREapet2();
	e.f1(arr, n);
		
	}

}
