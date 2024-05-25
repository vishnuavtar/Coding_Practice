package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class PriorityQueue {
	
	public static void main(String[] args) {
		
		java.util.PriorityQueue<Integer> p = new java.util.PriorityQueue<Integer>();
		p.add(50);
		p.add(10);
		p.add(20);
		p.add(30);
		p.add(40);
		p.add(1);
		
		
		System.out.println(p);
		
		System.out.println(p.peek());
		
		System.out.println(p.remove(30));
		System.out.println(p);
		
		Deque<Integer> d = new ArrayDeque<Integer>();
		d.add(1);
		d.add(2);
		d.add(3);
		d.addAll(p);
		System.out.println(d);
		
	}

}
