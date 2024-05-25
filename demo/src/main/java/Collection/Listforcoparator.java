package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Listforcoparator {

	
	public static void main(String[] args) {
		
	ArrayList<Emp> list = new ArrayList<>();
		
		list.add(new Emp(13,"Rohan2"));
		list.add(new Emp(15,"Rohan4"));
		list.add(new Emp(10,"Mohan"));
		list.add(new Emp(11,"Sohan"));
		list.add(new Emp(12,"Rohan"));
		
		Collections.sort(list,new IdComparator());
		
		System.out.println(list);
		
		Collections.sort(list, new NameComparator());
		
	}
}
