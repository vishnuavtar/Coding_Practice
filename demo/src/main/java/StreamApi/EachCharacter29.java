package StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacter29 {
	
	
	public static void main(String[] args) {
		
		String str2 = "This is Hyderabad";
		
		String str = str2.replaceAll("\\s", "");
		
	Map map = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.println(map);
	
	}

}
