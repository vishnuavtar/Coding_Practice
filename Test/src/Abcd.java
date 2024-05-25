import java.util.ArrayList;
import java.util.List;

public class Abcd {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(13);
		list.add(12); 

		System.out.println(list);

		list.stream().filter(i -> i % 2 == 0).forEach(System.out::print);

	}

}
