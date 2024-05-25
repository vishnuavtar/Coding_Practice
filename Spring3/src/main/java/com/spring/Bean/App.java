package com.spring.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App {

	
	@Bean(name = "temp")
	public Employee f1() {
		System.out.println("This is Hyderabad");
		return null;
		
	}

}
