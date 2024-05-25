package Lambda;

@FunctionalInterface
interface AAAA{
	
	abstract void f1();
}

public class l6 {
	
	public static void main(String[] args) {
		
		AAAA aa = () -> System.out.println("This is BY LAMBDA Expression");
		aa.f1();
	}

}
