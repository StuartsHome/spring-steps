package com.company.spring.basics.springsteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.spring.basics.springsteps.basic.BinarySearchImpl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=SpringStepsApplication.class) // this is where the context is present
public class BinarySearchTest {

    // get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int result = binarySearch.binarySearch(new int[] {}, 5);
        assertEquals(4, result);
    }
    
}
