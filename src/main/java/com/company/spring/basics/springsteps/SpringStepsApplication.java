package com.company.spring.basics.springsteps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringStepsApplication {


	// What are the beans spring has to manage?
		// Add @Components to the beans.
	// What are the dependencies of a bean?
		// Add @Autowired to the dependencies.
	// Where to search for beans?
		// All the beans are in the same package (dir)
		// Add a component scan, if no @SpringBootApplication

	public static void main(String[] args) {


		
		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl binarySearch2 = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		int result1 = binarySearch2.binarySearch(new int[] {12, 4, 6}, 3);

		// SpringApplication.run(SpringStepsApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(SpringStepsApplication.class, args);
		BinarySearchImpl binarySearch3 = applicationContext.getBean(BinarySearchImpl.class);
		int result2 = binarySearch3.binarySearch(new int[] {12, 4, 6}, 3);
		System.out.println(result);
		System.out.println(result2);


	}

}

/*
Notes:
1. Beings are instances of the object. In this case, instances of BinarySearchImpl
2. Application Context manages the beans - get the beans from the application context
3. There are three options for injection - Constructor injection and Setter injection

*/
