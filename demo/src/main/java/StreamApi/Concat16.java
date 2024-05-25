package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Concat16 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		int b[] = {1,2,3,4,5,6,7,8,9};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		Integer bb[] = Arrays.stream(b).boxed().toArray(Integer[]::new);
		
		Integer ai[] = Stream.concat(Arrays.stream(aa),Arrays.stream(bb)).toArray(Integer[]::new);
	
		System.out.println(Arrays.toString(ai));
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		
		Integer[] tt = list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(tt));
		
		int aaa[] = list.stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(aaa));
		
	}

}
