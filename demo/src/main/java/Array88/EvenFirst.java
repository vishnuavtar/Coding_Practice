package Array88;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenFirst {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);

		List<Integer> ai = Arrays.stream(aa).filter(i -> i % 2 == 0).collect(Collectors.toList());

		//System.out.println(ai);
		
		List<Integer> bi = Arrays.stream(aa).filter(i -> i % 2 != 0).collect(Collectors.toList());
		
		
		ai.addAll(bi);
		
		System.out.println(ai);
//		int aii[] = ai.stream().mapToInt(Integer::new).toArray();
//		int bii[] = bi.stream().mapToInt(Integer::new).toArray();
//		
//		Integer a2[] = Arrays.stream(aii).boxed().toArray(Integer[]::new);
//		Integer b2[] = Arrays.stream(bii).boxed().toArray(Integer[]::new);
//		
//		Integer ak[] = Stream.concat(Arrays.stream(a2),Arrays.stream(b2)).toArray(Integer[]::new);
//
//		System.out.println(Arrays.toString(ak));
	}

}
