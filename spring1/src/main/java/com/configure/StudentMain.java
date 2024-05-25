package com.configure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

		Student s = context.getBean("temp", Student.class);
		
		s.study();

		System.out.println(s);
		
	

	}

}
