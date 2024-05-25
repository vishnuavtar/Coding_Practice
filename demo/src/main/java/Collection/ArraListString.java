package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArraListString {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Abd");
		list.add("laptop");
		list.add("apple");
		list.add("zoo");
		list.add("pc");
		
		System.out.println(list);
		
		ListIterator<String> lt = list.listIterator();
		
		while(lt.hasNext()) {
			System.out.println(lt.next());
		}
		
		
		System.out.println("By Map");
		System.out.println(list.stream().map(i->i.length()).collect(Collectors.toList()));
	
		HashSet<String> set = new HashSet<String>(list);
		
		System.out.println(set);
		
		TreeSet<String> tree = new TreeSet<String>(set);
		System.out.println(tree);
		
		
		
	}

}
