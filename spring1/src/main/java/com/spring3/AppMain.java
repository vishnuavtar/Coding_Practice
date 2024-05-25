package com.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");

		A temp = (A) context.getBean("aref");

		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		
		System.out.println(temp);
	}

}
