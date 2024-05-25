package com.spring.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowired.xml");
		Employee ee = (Employee) context.getBean("employee");

		System.out.println(ee);

		
	}

}
