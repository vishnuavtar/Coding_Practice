package String99;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String str = "This is Hyderabad";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
	}

}
