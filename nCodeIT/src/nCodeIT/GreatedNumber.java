package nCodeIT;

public class GreatedNumber {

	public static int f1(int n[], int total) {

		for (int i = 0; i < total; i++) {

			for (int j = i + 1; j < total; j++) {

				if (n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}
		return n[total - 1];
	}

	public static void main(String[] args) {

		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(f1(n, 9));

	}

}
