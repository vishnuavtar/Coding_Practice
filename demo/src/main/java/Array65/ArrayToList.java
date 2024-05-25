package Array65;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {

		String str[] = { "vishnu", "avtar", "vishnuavtar", "Vishnu", "Avtar", "VishnuAvtar" };

		List<String> list = Arrays.asList(str);

		System.out.println(list);

		int a[] = { 1, 2, 4, 5, 6, 7, 8, 9 };

		List<Integer> list2 = new ArrayList<>();

		for (Integer e : a) {
			list2.add(e);
		}
		
		System.out.println(list2);
	}

}
