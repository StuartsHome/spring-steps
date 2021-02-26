package com.company.spring.basics.springsteps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

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

}