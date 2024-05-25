package nCodeIT;

public class ountODDEVENArray {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,201,11,22,3,44,55,66,73,1330,80,91};
		int count1=0;
		int count2=0;
		
		for(int i = 0; i<a.length; i++) {
			if(a[i]%2==0) {
				count1++;
			}else if(a[i]%2==1) {
				count2++;
			}
		}
		
		System.out.println("Even Number = " + count1);
		System.out.println("Odd  Number = " + count2);
	}

}
