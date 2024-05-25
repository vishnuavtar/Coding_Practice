package Lambda;


@FunctionalInterface
interface A{
	
	void f1();
}




public class l1{

	public static void main(String[] args) {
		
		A l  =  () ->System.out.println("This is a city"); 
		l.f1();
		
	}
}
