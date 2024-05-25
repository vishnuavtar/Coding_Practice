package com.spring.byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("byxml.xml");
		Employee ee = (Employee) context.getBean("employee");

		System.out.println(ee);
	}

}
