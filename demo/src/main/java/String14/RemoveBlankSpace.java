package String14;

public class RemoveBlankSpace {
	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
	}

}
