package Array81;

import java.util.Arrays;

public class SumOfAllArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,78,990};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		int ai = Arrays.stream(aa).mapToInt(Integer::new).sum();
		
		System.out.println(ai);
	}

}
