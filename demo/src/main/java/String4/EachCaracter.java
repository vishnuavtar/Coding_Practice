package String4;

public class EachCaracter {
	
	static final int max=256;
	
	public static void f1(String str) {
		
		int[] count = new int[max];
		
		for(int i = 0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
	
		char[] ch = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			
			int find=1;
			for(int j = i+1; j<=i; j++) {
				if(str.charAt(i)==str.charAt(j)) {
					find++;
				}
			}
			
			if(find==1) {
			System.out.println(str.charAt(i) + " =  " + count[str.charAt(i)]);
		}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		f1(str);
	}

}
