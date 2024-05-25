package nCodeIt2;
//Task9: Write a Java program to get the majority element from a given array of integers containing duplicates.
public class mejorityEMlementOfGuvenArray {
    static int feq = 0;
	static int max = 0;

	static int f1(int a[], int n) {

		for (int i = 0; i < n; i++) {
            int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}

			if (count > max) {
				max = count;
				feq = a[i];
				}
		}
		return feq;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 1, 6, 6, 6 };
		int n = a.length;
		System.out.println(f1(a, n));
	}
}
