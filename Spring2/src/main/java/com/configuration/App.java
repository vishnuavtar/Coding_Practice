package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class App {
	
	
	public Address f1() {
		return new Address();
	}
	
	
	public Employee f2() {
		Employee ee = new Employee(f1(), 0, null);
		return ee;
		
	}
		
	
	
	
}
