package String20;

public class RemoveBlankSpace {
	
	public static void main(String[] args) {
		
		
		String str = "This is a city";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
	}

}
