package StreamApi;

import java.util.Arrays;

public class SumOddEven {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 54, 5, 6, 7, 8, 9, 9 };
		
		Integer aa[]=  Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		int even = Arrays.stream(aa).filter(i->i%2==0).mapToInt(Integer::intValue).sum();
		int odd = Arrays.stream(aa).filter(i->i%2!=0).mapToInt(Integer::intValue).sum();
		
		
		System.out.println(even);
		System.out.println(odd);
		

	}

}
