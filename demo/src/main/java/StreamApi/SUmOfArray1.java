package StreamApi;

import java.util.Arrays;

public class SUmOfArray1 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,9};
		
		System.out.println(Arrays.stream(a).mapToLong(Integer::new).sum());
	}

}
