package com.spring.normal2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("normal2.xml");

		Employee ee = (Employee) context.getBean("normal2");

		System.out.println(ee.getId());
		System.out.println(ee.getName());
		System.out.println(ee.getAddress().getStreet());
		System.out.println(ee.getAddress().getPin());
	}

}
