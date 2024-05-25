

public class EachCharacter {
	
	final static int max = 256;
	
	static void f1(String str) {
		
		int a[] = new int[max];
		
		for(int i = 0; i<str.length(); i++) {
			
			a[str.charAt(i)]++;
		}
		
		char[] ch =  new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			
			ch[i] = str.charAt(i);
			
			int find = 0;
			for(int j = 0; j<=i; j++) {
				if(str.charAt(i)==ch[j]) {
					find++;
					
				}
			}
			
			if(find==1) {
				System.out.println(str.charAt(i) + " = " + a[str.charAt(i)]);
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		f1(str);
	}

}
