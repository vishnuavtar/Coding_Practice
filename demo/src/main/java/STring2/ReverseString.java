package STring2;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str = "This is My job";
		String nstr = "";
		char ch;
		
		for(int i = 0; i<str.length(); i++) {
		ch = str.charAt(i);
		nstr = ch+nstr;
		}
		
		System.out.println(nstr);
		
		if(str.equals(nstr)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
	}

}
