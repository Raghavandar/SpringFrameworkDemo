package com.example.demo.sortAlgorithm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public String sortNumbers() {
		return "In Quick Sort";
	}

}
