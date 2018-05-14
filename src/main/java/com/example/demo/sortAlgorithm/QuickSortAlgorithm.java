package com.example.demo.sortAlgorithm;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

	@Override
	public String sortNumbers() {
		return "In Quick Sort";
	}

}
