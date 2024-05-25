import java.util.ArrayList;
import java.util.List;

public class ListOfStrudent {
	
public int id;
private String name;
public String email;

public ListOfStrudent(int id, String name, String email) {
	// TODO Auto-generated constructor stub
	
	this.id = id;
	this.name=name;
	this.email=email;
	
}

public static void main(String[] args) {
	
	List<ListOfStrudent> list = new ArrayList<>();
     list.add(new ListOfStrudent(1,"abc","abc@abc"));
     System.out.println(list);
	
}
	
}
