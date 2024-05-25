package String96;

public class ReverseSplit {
	
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String str2[] = str.split(" ");
		
		String str3 = " ";
		String nstr = " ";
		char ch;
		
		for(int i = str2.length-1; i>=0; i--) {
			str3 = str3+str2[i] + " ";
		}
		
		
		System.out.println(str3);
	}

}
