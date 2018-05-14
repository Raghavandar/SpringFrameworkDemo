package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.sortAlgorithm.SortAlgorithm;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SearchNumberServiceImpl {
	
	@Autowired
	SortAlgorithm sortAlgorithm;
	
	public String searchNumber() {
		return sortAlgorithm.sortNumbers();
	}

}
