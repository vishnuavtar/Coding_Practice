package String23;

public class RemoveBlanckSpace {
	
	public static void main(String[] args) {
		
		
		String str = "This is String";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
		
		
	}

}
