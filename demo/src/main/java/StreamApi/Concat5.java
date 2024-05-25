package StreamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class Concat5 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,56,7,8};
		int b[] = {1,2,3,4};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Integer bb[] = Arrays.stream(b).boxed().toArray(Integer[]::new);
		
	  Integer ai[] = Stream.concat(Arrays.stream(aa),Arrays.stream(bb)).toArray(Integer[]::new);
		
		
		System.out.println(Arrays.toString(ai));
	}

}
