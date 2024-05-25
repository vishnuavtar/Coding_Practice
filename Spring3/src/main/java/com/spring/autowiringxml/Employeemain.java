package com.spring.autowiringxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeemain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("autowiringxml.xml");

		Employee ee = (Employee) context.getBean("employee");

		System.out.println(ee);
		
	}

}
