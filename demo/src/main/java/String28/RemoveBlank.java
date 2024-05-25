package String28;

public class RemoveBlank {
	
	public static void main(String[] args) {
		
		String str = "This is String";
		System.out.println(str);
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
;		
	}

}
