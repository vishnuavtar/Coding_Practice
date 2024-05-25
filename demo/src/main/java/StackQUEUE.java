import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StackQUEUE {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();

		s.add(10);
		s.add(20);
		s.push(50);
		s.push(30);
		s.add(10);
		s.add(20);
		s.push(50);
		s.push(30);
		s.pop();
		s.search(10);

		System.out.println(s);
		
		Iterator tt = s.iterator();
		
		while(tt.hasNext()) {
			System.out.println(tt.next());
		}
		
		HashSet<Integer> set = new HashSet<Integer>(s);

		System.out.println(set);
		
		LinkedList<Integer> ll = new LinkedList<Integer>();

		ll.add(10);
		ll.add(20);
		ll.add(50);
		
		System.out.println(ll);
	}

}
