package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class PriorituQue {

	
	
	public static void main(String[] args) {
		
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		System.out.println(q);
		
		
		int a = q.peek();
		
		System.out.println(a);
		
		q.remove(40);
		
		System.out.println(q);
		
		int b = q.remove();
		
		System.out.println(b);
		
		System.out.println(q);
		
		Iterator i = q.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
		Deque<Integer> d = new ArrayDeque<Integer>();
		
		d.add(10);
		
		System.out.println(d);
		
		
		System.out.println("Stack Data");
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		
		s.add(30);
		
		System.out.println(s);
		int s1 = s.pop();
		
		System.out.println(s1);
		
		
		System.out.println("After iterator");
		
		Iterator<Integer> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}
	
	
}
