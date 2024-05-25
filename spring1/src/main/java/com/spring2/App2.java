package com.spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		Emp emp1 = (Emp)context.getBean("Emp1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.getCourses());
		
		
		
	}

}
