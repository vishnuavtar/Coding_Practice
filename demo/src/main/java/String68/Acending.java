package String68;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Acending {

	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		String[] str2 = str.split("\\s+");
		
		System.out.println(Arrays.stream(str2).sorted().collect(Collectors.toList()));
	}
	
}
