package Array75;

import java.util.Arrays;
import java.util.stream.Stream;

public class Concat {
	
	public static void main(String[] args) {
		
		Integer a[] = {1,2,3,4,5,6,7,8,1,2,3};
		Integer b[] = {1,2,3,4,5,6,7,8,1,2,3};
		
		Integer ai[] = Stream.concat(Arrays.stream(a),Arrays.stream(b)).toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(ai));
	}

}
