package StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharaceter {
	
	public static void main(String[] args) {
		
		String str = "This is Banaglore";
		
		Map<Character,Long> map =   str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
	}

}
