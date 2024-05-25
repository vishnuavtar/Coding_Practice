package Lambda;




@FunctionalInterface
interface aa{
	
	void f1();
}

public class l9 {

	public static void main(String[] args) {
		
		aa obj = ()->System.out.println("Ok");
		obj.f1();
	}
}
