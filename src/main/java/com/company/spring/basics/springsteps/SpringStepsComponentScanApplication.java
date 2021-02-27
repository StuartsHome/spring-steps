package com.company.spring.basics.springsteps;

import com.company.spring.basics.componentscan.ComponentDAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@ComponentScan("package com.company.spring.basics.componentscan;")
public class SpringStepsComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringStepsScopeApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringStepsApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);


		LOGGER.info("{}", componentDAO);


	}

}

/*
Notes:
1. Beings are instances of the object. In this case, instances of BinarySearchImpl
2. Application Context manages the beans - get the beans from the application context
3. There are three options for injection - Constructor injection and Setter injection

*/
