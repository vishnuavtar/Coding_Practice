package Lambda;

@FunctionalInterface
interface Abd {
	
	void f1();
}


public class L3 {
	
	public static void main(String[] args) {
		
		
		Abd aa = ()-> System.out.println("This is functional inteface");
		
		aa.f1();
	}

}
