package String17;

public class RemoveBlankSpavce {
	
	public static void main(String[] args) {
		
		String str = "This is mine";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
	}

}
