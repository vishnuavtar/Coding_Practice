package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("Hello");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Student student2 = (Student) context.getBean("student1");

		System.out.println(student2);

	}

}
