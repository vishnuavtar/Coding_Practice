package Array108;

import java.util.Arrays;

public class SumOfAllArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,1,2,3,4,5};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		Integer aaa  =Arrays.stream(aa).mapToInt(Integer::new).sum();
	
		System.out.println(aaa);
	
	}

}
