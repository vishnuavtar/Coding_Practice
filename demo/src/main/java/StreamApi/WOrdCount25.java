package StreamApi;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WOrdCount25 {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
	System.out.println(Arrays.stream(str.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
	}

}
