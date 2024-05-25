package com.spring.component2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Employeemain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Employee ee = (Employee) context.getBean("employee");

		System.out.println(ee);

	}

}
