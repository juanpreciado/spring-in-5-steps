package com.juan.spring.basics.springin5steps;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		//Implementing sorting logic
		//Bubble sort algorithm
		//search the array
		System.out.println(sortAlgorithm);
		return 3;
	}
}
