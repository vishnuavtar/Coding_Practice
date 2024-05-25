package String89;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EachCharacter {

	public static void main(String[] args) {

		String str = "This is Bangalore";

//		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		System.out.println(map);

		int count[] = new int[256];

		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		char ch[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {
				if (str.charAt(i) == ch[j]) {
					find++;
				}
			}

			if (find == 1) {
				System.out.println(str.charAt(i) + " " + count[str.charAt(i)]);
			}
		}

	}

}
