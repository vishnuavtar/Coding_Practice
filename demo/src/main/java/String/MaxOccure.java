package String;

public class MaxOccure {
	
	static final int asc = 256;

	static char f1(String str) {
		
		int[] count = new int[asc];
		
		for(int i = 0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		int max = -1;
		char result = ' ';
		
		for(int i = 0; i<str.length(); i++) {
			if(max<count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		String str = "my y  j job";
		
		System.out.println(f1(str));
	}
}
