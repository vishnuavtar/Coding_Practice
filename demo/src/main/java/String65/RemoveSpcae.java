package String65;

public class RemoveSpcae {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
	}

}
