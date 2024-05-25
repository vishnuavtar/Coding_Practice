package StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacter10 {
	
	public static void main(String[] args) {
		
		String str = "This is Banaglore";
		
		Map<Character,Long> map =   str.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	
		System.out.println(map);
	}

}
