package File2;

public class G2<T> {

	
	public void f1(T a) {
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		G2<Integer> g = new G2<Integer>();
		g.f1(10);
		
		G2<String> g2 = new G2<String>();
		g2.f1("Vishnu Avtar");
		
	}
	
}
