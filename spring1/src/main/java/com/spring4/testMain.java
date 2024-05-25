package com.spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");

		Person p = (Person) context.getBean("person");
		System.out.println(p);
	}

}
