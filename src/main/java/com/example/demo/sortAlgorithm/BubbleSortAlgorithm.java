package com.example.demo.sortAlgorithm;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public String sortNumbers() {
		return this +"";
	}

}
