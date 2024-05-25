package Array26;

public class NonRepeatByOther {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,89,2,8};
		
		boolean visited[] = new boolean[a.length];		
		for(int i = 0 ; i<a.length; i++) {
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
				System.out.println(a[i] + " ");
			}
		}
		
		
	}

}
