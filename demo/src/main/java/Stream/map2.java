package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map2 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,11,66,88,44,33,22);
		System.out.println(list.stream().map(i->i*3).collect(Collectors.toList()));
		
	}

}
