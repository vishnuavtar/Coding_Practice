package Comp2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Productlist {
	
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
	
	
		list.add(new Product(1,"apple",100));
		list.add(new Product(2,"mango",1070));
		list.add(new Product(30,"apple",300));
		list.add(new Product(4,"mango",1006));
		list.add(new Product(5,"apple",1002));
		
		Map<String,Long> map =   list.stream().collect(Collectors.groupingBy(Product::getName,Collectors.counting()));

		System.out.println(map);
		Map<String,Double> map2 =   list.stream().collect(Collectors.groupingBy(Product::getName,Collectors.averagingDouble(Product::getPrice)));
	
		System.out.println(map2);
		
		list.stream().sorted(Comparator.comparing(Product::getId)).forEach(System.out::print);
	}

}
