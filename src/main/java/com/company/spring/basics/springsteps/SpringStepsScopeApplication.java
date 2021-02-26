package com.company.spring.basics.springsteps;

import com.company.spring.basics.springsteps.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringStepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringStepsScopeApplication.class);

	public static void main(String[] args) {


		
		ApplicationContext applicationContext = SpringApplication.run(SpringStepsApplication.class, args);
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnecction());

		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnecction());

	}

}
