package CustomeExce;

//class uv extends Exception {
//
//	uv(String str) {
//		super(str);
//	}
//}

public class uav {

	public static void main(String[] args) {

		try {
			int n = divide(10, 10);
			System.out.println(n);
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
	
	public static int divide(int a, int b)  throws Exception {
		
		if(b==0) {
			throw new Exception("not allowed");
		}
		
		return a/b;
	}
}
