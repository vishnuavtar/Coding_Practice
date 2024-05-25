import java.util.ArrayList;

public class ArrayList1 {
	
	public static void main(String[] args) {
		//2 4 8 10
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(8);
		list.add(10);
	    list.stream().map(i->i^2).forEach(System.out::print);
		
	}

}
