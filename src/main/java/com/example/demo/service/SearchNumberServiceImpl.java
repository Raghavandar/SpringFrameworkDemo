package com.example.demo.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.sortAlgorithm.SortAlgorithm;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SearchNumberServiceImpl {
	
	@Autowired
	@Qualifier("bubble")
	SortAlgorithm sortAlgorithm;
	
	public String searchNumber() {
		return sortAlgorithm.sortNumbers();
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("In Post construct");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("In Pre Destroy");
	}

}
