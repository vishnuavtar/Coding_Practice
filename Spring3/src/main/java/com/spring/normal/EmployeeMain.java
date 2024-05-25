package com.spring.normal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("normal.xml");
		Employee ee = (Employee) context.getBean("employee");
		System.out.println(ee);

		System.out.println(ee.getAddress().getStreet());
		System.out.println(ee.getAddress().getPin());

	}

}
