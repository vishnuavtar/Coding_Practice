package Array106;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class Slargest {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9};
		
		Integer aa[] =Arrays.stream(a).boxed().toArray(Integer[]::new);
		
	Integer map = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder())
		.skip(1).findFirst().orElseThrow( () -> new IllegalStateException("Bad Exception"));
	
	System.out.println(map);
	}

}
