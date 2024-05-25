
public class Abcd implements Abc {

	@Override
	public void f1() {
		System.out.println("This is f1");
	}
	
	public static void main(String[] args) {
		
		
		Abcd obj = new Abcd();
		obj.f1();
	}

}
