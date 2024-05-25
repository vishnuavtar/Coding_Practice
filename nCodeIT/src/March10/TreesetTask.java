package March10;

import java.util.TreeSet;

public class TreesetTask {
	
	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Red");
		tree.add("Green");
		tree.add("Black");
		tree.add("White");
		tree.add("Pink");
		tree.add("Yellow");
		
		System.out.println(tree);
		System.out.println(tree.size());
		
		for(String element : tree) {
			System.out.println(element);
		}
	}

}
