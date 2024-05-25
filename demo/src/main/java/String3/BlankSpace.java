package String3;

public class BlankSpace {

	
	public static void main(String[] args) {
		
		String str = "This is My Job";
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
	}
}
