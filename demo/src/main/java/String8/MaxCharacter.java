package String8;

public class MaxCharacter {
	
	static char f1(String str) {
		
		int count[] = new int[256];
		
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
		
		String str = "jneeeeejnejknv";
		System.out.println(f1(str));
		
	}
	
}
