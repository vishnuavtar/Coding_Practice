package StreamApi;

import java.util.Arrays;
import java.util.stream.Stream;

public class Concat2 {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4};
		Integer b[] = {1,2,3,4};
		
		Integer ai[] = Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(ai));
	}

}
