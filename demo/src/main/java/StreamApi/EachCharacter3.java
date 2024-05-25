package StreamApi;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import String3.Count;

public class EachCharacter3 {
	
	public static void main(String[] args) {
		
		String str = "This is Bangalore";
		
		Map<Character,Long> map = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		map.forEach((Character,count)->System.out.println(Character + " " + count));
	}

}
