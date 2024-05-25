package Number;

import java.util.Arrays;
import java.util.Comparator;

public class SlArgest2 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10,1,3,4,5,6,7,10,9,9,2,3,5,6,10,7};
		
		int aa = Arrays.stream(a).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow( ()-> new IllegalStateException("Array is Empty"));
		
		System.out.println(aa);
	}

}
