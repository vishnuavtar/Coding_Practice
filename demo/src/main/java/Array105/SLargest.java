package Array105;

import java.util.Arrays;
import java.util.Comparator;

public class SLargest {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,9,10,10};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
	int aaa = 	Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow(() -> new IllegalStateException("Bad COndition")); 

	System.out.println(aaa);
	
	int[] b = Arrays.stream(aa).mapToInt(Integer::new).toArray();
	
	System.out.println(b.toString());
	
	}

}
