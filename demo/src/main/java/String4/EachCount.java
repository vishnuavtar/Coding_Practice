package String4;

public class EachCount {

	static final int max = 256;

	static void f1(String str) {

		int count[] = new int[max];
		
		for(int i = 0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		char ch[] = new char[str.length()];
		
		for(int i = 0; i<str.length(); i++) {
			
			ch[i] = str.charAt(i);
			
			int find=1;
			
			for(int j = i+1; j<str.length(); j++) {
			if(ch[i]==ch[j]) {
				find++;
			}
			}
			
			if(find==1) {
				System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		String str = "This is my String";
		f1(str);
		
	}

}
