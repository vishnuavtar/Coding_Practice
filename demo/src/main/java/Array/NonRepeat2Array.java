package Array;

public class NonRepeat2Array {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4 };
		boolean chk;
		for (int i = 0; i < a.length; i++) {

			chk = false;

			for (int j = 0; i < a.length; j++) {
				if (i != j && a[i] == a[j]) {
					chk = true;
					continue;
				}
			}
			
			if(!chk) System.out.println(a[i] + "" );
		}
	}
}
