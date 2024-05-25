package com.spring.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("app.class");
		Employee ee = context.getBean("temp", Employee.class);
		
		System.out.println(ee);
		
	}

}
