package String;

public class RemoverBlankSpace {
	
	public static void main(String[] args) {
		
		String str = "This is job";
		
		String str2  = str.replaceAll("\\s", "");
		System.out.println(str2);
	}

}
