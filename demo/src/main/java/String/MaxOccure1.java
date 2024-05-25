package String;

public class MaxOccure1 {

	
	static final int asc=256;
	public static char f1(String str) {
		
		int count[] = new int[asc];
		
		int len = str.length();
		
		for(int i = 0; i<len; i++) {
			count[str.charAt(i)]++;
		}
		
		int max = -1;
		char result= ' ';
		for(int i = 0; i<len; i++) {
			if(max<count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		
		return result;
		
	}
	
public static void main(String[] args) {
	

	String str = "This is my job";
	System.out.println("Max = " +  f1(str));
	
}

	
	
}
