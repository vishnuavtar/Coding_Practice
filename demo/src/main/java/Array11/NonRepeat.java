package Array11;

public class NonRepeat {
	
	
	static void f1(int a[]) {
		
		boolean visited[] = new boolean[a.length];
		
		for(int i = 0; i<a.length; i++) {
			
			if(visited[i]==true) {
				continue;
			}
			
			int  find = 1;
			for(int j = i+1; j<a.length; j++) {
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
		
		int a[] = {1,2,3,4,1,2,3,4,5,6,7,8,9};
		f1(a);
		
		
	}
}
