package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("test.xml");

		Employee e = context.getBean("address", Employee.class);

		System.out.println(e);

	}
}
