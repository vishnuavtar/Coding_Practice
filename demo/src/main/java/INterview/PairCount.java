package INterview;

import java.util.HashMap;

public class PairCount {
	
	
	
	public static void main(String[] args) {
		
		
		String str = "WE, THE PEOPLE OF INDIA, having solemnly resolved to constitute India into a SOVEREIGN SOCIALIST SECULAR DEMOCRATIC REPUBLIC and to secure to all its citizens"
				+ "	+ \"JUSTICE, social, economic and political;"
				+ "	+ \"LIBERTY of thought, expression, belief, faith and worship;"
				+ " + \"EQUALITY of status and of opportunity;"
				+ "	+ \"and to promote among them all FRATERNITY"
				+ "	+ \"assuring the dignity of the individual and the unity and integrity of the Nation;"
				+ "	+ \"IN OUR CONSTITUENT ASSEMBLY this 26th day of November 1949, do HEREBY ADOPT, ENACT AND GIVE TO OURSELVES THIS CONSTITUTION.";
		
		HashMap<String,Integer> map = new HashMap<>();
		
		
		String[] str2 = str.split(" ");
		
		for(String str3 : str2) {
			
			Integer i = map.get(str3);
			
			if(i==null) {
				map.put(str3, 1);
				
			}else {
				map.put(str3, i+1);
				
			}
			
			
			
		}
		
		System.out.println(map);
			
	
		
	}
	

}
