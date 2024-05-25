package Array83;

import java.util.Arrays;

public class Compare {
	
	 public static void main(String[] args) {
		
			int a[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3 ,11};

			int b[] = { 1, 2, 3, 4, 5, 6, 1, 2, 3 ,11};

			System.out.println(Arrays.equals(a, b));  
			
			Integer aa[] = Arrays.stream(a).boxed().toArray(Integer[]::new);
			
			Arrays.stream(aa).map(e->e+"").filter(e->e.startsWith("1")).forEach(System.out::print);
	}

}
