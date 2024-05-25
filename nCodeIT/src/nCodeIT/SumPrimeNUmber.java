package nCodeIT;

public class SumPrimeNUmber {
	public static void main(String args[]) {
		int count, sumprime = 0;

		for (int pnum = 1; pnum <= 100; pnum++) {
			count = 0;
			for (int i = 2; i <= pnum / 2; i++) {

				if (pnum % i == 0) {

					count++;
					break;
				}
			}
			if (count == 0 && pnum != 1) {

				sumprime = sumprime + pnum;
			}
		}

		System.out.println("Total =  " + sumprime);
	}
}