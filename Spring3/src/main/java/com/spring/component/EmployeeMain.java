package com.spring.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Employee ee = context.getBean("employee", Employee.class);
		Address a = context.getBean("address", Address.class);
		System.out.println(ee.getId());
		System.out.println(ee.getName());

		System.out.println(a.getStreet());
		System.out.println(a.getPin());

	}

}
