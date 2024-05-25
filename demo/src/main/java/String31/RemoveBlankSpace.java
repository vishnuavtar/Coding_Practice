package String31;

public class RemoveBlankSpace {
	
	public static void main(String[] args) {
		
		String str = "This si Bangalore";
		
		String str2 = str.replaceAll("\\s", "");
		System.out.println(str2);
		
	}

}
