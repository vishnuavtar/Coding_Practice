package com.spring6;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaMain {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config6.xml");

		Samosa s = (Samosa) context.getBean("s1");

		System.out.println(s);

		context.registerShutdownHook();

		Pepsi p = (Pepsi) context.getBean("p1");

		System.out.println(p);
		
		Example ee = (Example)context.getBean("e");
		
		System.out.println(ee);
	}

}
