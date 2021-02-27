package com.company.spring.basics.springsteps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired // the BinarySearchImp depends on the SortAlgorithm // autowiring by type
    private SortAlgorithm sortAlgorithm;

    // private SortAlgorithm bubbleSortAlgorithm // autowiring by type and instance name variable


    // This is constructor injection
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    // You could also use setter injection
    /*
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
    */

    public int binarySearch(int[] numbers, int target) {
        /*
        Commented out to use the sortAlgorithm constructor
        BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        */

        // Now uses the interface
        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);

        return 3;
    }

    @PostConstruct
    public void PostConstruct(){
        logger.info("postConstruct");

    }

    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy");

    }

}