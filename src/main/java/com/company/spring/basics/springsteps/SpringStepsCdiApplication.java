package com.company.spring.basics.springsteps;

import com.company.spring.basics.springsteps.cdi.SomeCDIBusiness;
import com.company.spring.basics.springsteps.scope.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringStepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringStepsScopeApplication.class);

	public static void main(String[] args) {


		
		ApplicationContext applicationContext = SpringApplication.run(SpringStepsApplication.class, args);
		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		LOGGER.info("{} dao/{}", business, business.getSomeCdiDAO());


	}

}
