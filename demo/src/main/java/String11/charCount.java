package String11;

public class charCount {
	
	static void f1(String str) {
		
		int a[] = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			a[str.charAt(i)]++;
		}
		
		char ch[] =  new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			
			int find = 1;
			
			for(int j = 0; j<str.length(); j++) {
				if(str.charAt(i)==ch[j]) {
					find++;
				}
			}
			
			if(find==1) {
				System.out.println(str.charAt(i) + " = " + a[(str.charAt(i))]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		f1(str);
		
		
	}

}
