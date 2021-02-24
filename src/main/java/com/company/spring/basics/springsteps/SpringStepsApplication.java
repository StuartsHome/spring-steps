package com.company.spring.basics.springsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		int result2 = binarySearch2.binarySearch(new int[] {12, 4, 6}, 3);

		System.out.println(result);
		System.out.println(result2);

		//SpringApplication.run(SpringStepsApplication.class, args);
	}

}
