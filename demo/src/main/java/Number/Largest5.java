package Number;

public class Largest5 {

	public static int f1(int a[], int total) {

		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		return a[total - 2];
	}

	public static void main(String[] args) {
		
		int a[] = {1,2,3,10,4,5,6};
		
		int b = a.length;
		
		System.out.println(f1(a,b));
	}

}
