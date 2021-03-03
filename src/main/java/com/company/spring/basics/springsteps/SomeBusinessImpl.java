package com.company.spring.basics.springsteps;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    int findTheGreatest(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for (int value : data) {
            if (value > greatest){
                greatest = value;
            }
            
        }
        return greatest;
    }
}