package Array31;

public class DublicatePrint {
	
public static void main(String[] args) {
	
	int a[]= {1,9,8,2,5,4,23,98,123,11,11};
	
	for(int i = 0; i<a.length; i++) {
		
		for(int j = i+1; j<a.length; j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}

}


}
