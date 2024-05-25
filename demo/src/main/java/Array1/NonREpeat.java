package Array1;

public class NonREpeat {
	
	static void f1(int[] a, int n) {
		
		boolean[] visited = new boolean[n];
		
		for(int i = 0; i<a.length; i++) {
			if(visited[i]==true) {
				continue;
			}
			
			int find=0;
			
			for(int j = 0; j<a.length; j++) {
				
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
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5};
		int n = a.length;
		f1(a,n);
		
	}

}
