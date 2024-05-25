package String13;

public class RemoveSpace {

	
	public static void main(String[] args) {
		
		String str = "This is my job";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
	}
}
