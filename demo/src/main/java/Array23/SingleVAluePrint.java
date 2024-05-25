package Array23;

public class SingleVAluePrint {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5 , 10 ,1,2,3,4,5,6};

		boolean chk;

		for (int i = 0; i < a.length; i++) {
			chk = false;
			for (int j = i+1; j < a.length; j++) {
				if (i!=j && a[i]==a[j]) {

					chk = true;
					continue;
				}
			}

			if (!chk)
				System.out.print(a[i] + " ");
		}

	}
}
