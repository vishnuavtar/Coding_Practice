package Array105;

import java.util.Arrays;

public class SUmOfALlArray {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		Integer aaa = Arrays.stream(aa).mapToInt(Integer::intValue).sum();
		
		System.out.println(aaa);
	}

}
