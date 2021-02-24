package com.company.spring.basics.springsteps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) { //takes an array of ints and returns array of ints
        // The logic of the BubbleSortAlgorithm can be changed here - without affecting 
        // the binarySearchImpl

        return numbers;
    }
}
