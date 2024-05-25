package com.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class autoMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("auto.xml");

		Emp ee = (Emp) context.getBean("emp1");

		System.out.println(ee);
//				System.out.println(ee.getAddress().getStreet());
//		         System.out.println(ee.getAddress().getCity());

	}

}
