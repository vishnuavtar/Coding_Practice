package InterviewL;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class LIkedList1 {
	
	
	public static void main(String[] args) {
		
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		
		
		System.out.println(list);
		
		// ArrYlist to HAshset
		
		
		ArrayList<Integer> aa = new ArrayList<>();
		
		aa.add(100);
		
		aa.add(100);
		
		
		HashSet<Integer> hh = new HashSet<>(aa);
		
		System.out.println(hh);
		
		
		
		
		System.out.println("By LikedList now");
		
		LinkedList<Integer> lll = new LinkedList<Integer>();
		
		lll.add(41);
		lll.add(31);
		lll.add(10);
		lll.add(20);
		lll.add(30);
		
		
		System.out.println(lll);
		
		Iterator t = lll.iterator();
		
		while(t.hasNext()) {
			System.out.println(t.next());
		}
		
	}

}
