package Lambda;



@FunctionalInterface
interface AA{
	
	void f1();
	
}

//class AAA implements AA{
//	
//	public void f1() {
//		System.out.println("THis is  String");
//	}
//}


public class l2 {
	

	public static void main(String[] args) {
		
//		AA a = new AAA();
		
		AA a = () -> System.out.println("This is String");
		
		a.f1();
		
		
	}

}
