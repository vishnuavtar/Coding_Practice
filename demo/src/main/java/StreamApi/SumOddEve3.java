package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SumOddEve3 {

	
	public static void main(String[] args) {
		
		int a[]=  {1,2,3,4,5,6,678,11,89};
		
		Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(aa);
		
		int even = list.stream().filter(i->i%2==0).mapToInt(Integer::new).sum();
		System.out.println(even);
		
		int odd = list.stream().filter(i->i%2!=0).mapToInt(Integer::new).sum();
		
		System.out.println(odd);
	}
}
