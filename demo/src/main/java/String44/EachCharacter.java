package String44;

public class EachCharacter {

	
	public static void f1(String str) {
		
		int count[] = new int[256];
		
		for(int i = 0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		char ch[] = new char[str.length()];
		int find = 1;
		for(int i = 0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
			
			for(int j = i+1; j<str.length(); j++) {
				if(ch[i]==ch[j]) {
					find++;
				}
			}
			if(find==1) {
				System.out.println(str.charAt(i) + " " + count[str.charAt(i)]);
			}
		}
	}
	
	public static void main(String[] args) { 
		
		String str = "This is bangalore";
		
		String str2 = str.replaceAll("\\s", "");
		
		f1(str2);
	}

}
