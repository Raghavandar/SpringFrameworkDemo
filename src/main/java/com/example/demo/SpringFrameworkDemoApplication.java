package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.componentscan.DummyComponent;
import com.example.demo.service.SearchNumberServiceImpl;

@SpringBootApplication
@ComponentScan({"com.componentscan", "com.example.demo"})
public class SpringFrameworkDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = 
				SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		
		SearchNumberServiceImpl serviceImpl = 
				applicationContext.getBean(SearchNumberServiceImpl.class);
		
		SearchNumberServiceImpl serviceImpl1 = 
				applicationContext.getBean(SearchNumberServiceImpl.class);
		
		DummyComponent component = applicationContext.getBean(DummyComponent.class);
		
		//System.out.println(serviceImpl.searchNumber());
		//System.out.println(serviceImpl);
		//System.out.println(serviceImpl.searchNumber());
		//System.out.println(serviceImpl1);
		//System.out.println(serviceImpl1.searchNumber());
	}
}
