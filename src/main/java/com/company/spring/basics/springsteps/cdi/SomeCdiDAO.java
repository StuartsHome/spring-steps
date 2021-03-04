package com.company.spring.basics.springsteps.cdi;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Named
public class SomeCdiDAO {

    public int[] getData() {
        return new int[] {5, 89, 100};
    }
    
}