package String30;

public class RemoveBalnSpace {
	
	public static void main(String[] args) {
		
		String str = "THis is Bamgalore";
		
		String str2 = str.replaceAll("\\s", "");
		
		System.out.println(str2);
	}

}
