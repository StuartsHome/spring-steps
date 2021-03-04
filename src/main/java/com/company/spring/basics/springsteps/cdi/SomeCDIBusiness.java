package com.company.spring.basics.springsteps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// CDI is JEE standard
// Sping is the implementation

@Named
public class SomeCDIBusiness {

    @Inject
    SomeCdiDAO someCdiDAO;


    public SomeCdiDAO getSomeCdiDAO() {
        return someCdiDAO;
    }

    public void setSomeCdiDAO(SomeCdiDAO someCdiDAO) {
        this.someCdiDAO = someCdiDAO;
    }


    public int findGreatest() {
        int greatest = Integer.MIN_VALUE;
        int[] data = someCdiDAO.getData();
        for (int value : data) {
            if (value > greatest) {
                greatest = value;
            }
        }
        return greatest;
    }
    
}
