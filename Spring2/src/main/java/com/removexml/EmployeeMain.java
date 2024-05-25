package com.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		Employee ee = (Employee) context.getBean("e");
		System.out.println(ee);
				
				
	}

}
