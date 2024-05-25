import java.util.List;

public class gret {

	public static void main(String[] args) {

	List<Integer> list = List.of(1,2,3,4,5,6,7,8);
		
		list.stream().filter(i->i>3).forEach(System.out::print);
		
//		save and flush
//		
//		id 1,2,3,4,5,3,4,5,6,7
//		
//		select * from employee inner join salary on employee.id=salary.id;
//		
	}

}
