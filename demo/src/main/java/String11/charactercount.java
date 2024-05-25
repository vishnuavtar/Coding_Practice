package String11;

public class charactercount {
	
	static final int maxchar = 256;
	
	static void f1(String str) {
		
		int a[] = new int[maxchar];
		
		for(int i = 0; i<str.length(); i++) {
			a[str.charAt(i)]++;
		
		}
		
		char ch[] = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			
			a[i] = str.charAt(i);
			
		
		int count=1;
		for(int j = 0; j<=i; j++) {
			if(str.charAt(i)==ch[j]) {
				count++;
			}
			
		}
		
		if(count==1) {
			System.out.println(str.charAt(i) + " = " + a[str.charAt(i)]);
		}
	}
	}
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		f1(str);
	}

}
