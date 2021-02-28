package com.company.spring.basics.springsteps;

import com.company.spring.basics.springsteps.basic.BinarySearchImpl;
import com.company.spring.basics.springsteps.basic.BubbleSortAlgorithm;
import com.company.spring.basics.springsteps.properties.SomeExternalService;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@SpringBootApplication
@Configuration
@ComponentScan("com.company.spring.basics.springsteps")
@PropertySource("classpath:app.properties")
public class SpringStepsPropertiesApplication {


	// What are the beans spring has to manage?
		// Add @Components to the beans.
	// What are the dependencies of a bean?
		// Add @Autowired to the dependencies.
	// Where to search for beans?
		// All the beans are in the same package (dir)
		// Add a component scan, if no @SpringBootApplication

	public static void main(String[] args) {


		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringStepsApplication.class)) {
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceURL());
		}
	}

}

/*
Notes:
1. Beings are instances of the object. In this case, instances of BinarySearchImpl
2. Application Context manages the beans - get the beans from the application context
3. There are three options for injection - Constructor injection and Setter injection

*/
