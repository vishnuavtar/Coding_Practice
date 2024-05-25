package com.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.configure")
public class StudentConfig {
	
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
	@Bean(name = "temp")
	public Student getStudent() {
		Student student  = new Student(getSamosa());
		
		return student;
	}
	
	

}
