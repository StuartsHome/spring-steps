package com.company.spring.basics.springsteps;

import com.company.spring.basics.springsteps.basic.BinarySearchImpl;
import com.company.spring.basics.springsteps.basic.BubbleSortAlgorithm;
import com.company.spring.basics.springsteps.xml.XMLPersonDAO;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
@Configuration
@ComponentScan("com.company.spring.basics.springsteps")
public class SpringStepsXMLContextApplication {


	// What are the beans spring has to manage?
		// Add @Components to the beans.
	// What are the dependencies of a bean?
		// Add @Autowired to the dependencies.
	// Where to search for beans?
		// All the beans are in the same package (dir)
		// Add a component scan, if no @SpringBootApplication

	public static void main(String[] args) {


		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDAO);
			System.out.println(personDAO.getXMLJdbcConnection());
		}
	}

}
