package MaxMinREpeatedValueInArray;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeated {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2,2,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,9,0);
		
		int mostRepeated = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		        .entrySet().stream().max(Map.Entry.comparingByValue())
		        .map(Map.Entry::getKey).orElseThrow();
		
		System.out.println(mostRepeated);

	}

}
