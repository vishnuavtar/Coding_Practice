package Lambda;


@FunctionalInterface
interface t1{
	
	void f1();
}

public class l21 {

	 public static void main(String[] args) {
		
		 t1 obj = ()-> System.out.println("This is Banaglore");
		 obj.f1();
		 
	}
}
