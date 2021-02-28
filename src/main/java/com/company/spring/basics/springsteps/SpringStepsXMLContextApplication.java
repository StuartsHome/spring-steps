package com.company.spring.basics.springsteps;

import com.company.spring.basics.springsteps.xml.XMLPersonDAO;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringStepsXMLContextApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringStepsScopeApplication.class);

	public static void main(String[] args) {


		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			LOGGER.info("Beans Loaded: {}", (Object)applicationContext.getBeanDefinitionNames()); // Type cast the return variable to object to print all return values in an array

			XMLPersonDAO personDAO = applicationContext.getBean(XMLPersonDAO.class);
			System.out.println(personDAO);
			System.out.println(personDAO.getXMLJdbcConnection());
		}
	}

}
