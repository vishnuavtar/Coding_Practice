
public class Abstract2 implements Abstract1 {

	@Override
	public void f1() {
		System.out.println("This is f1");
	}
	
	public static void main(String[] args) {
		
		Abstract1 aa = new Abstract2();
		aa.f1();
		
	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub
		
	}

}
