package Array62;

public class ReverseArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8 };

//		for(int i = a.length-1; i>=0; i--) {
//			System.out.println(a[i]);
//		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
			System.out.println(a[i]);
		}

	}
}
