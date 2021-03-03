package com.company.spring.basics.springsteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessStubTest {
    private DataService dataService;

    @Test
    public void testFindGreatest(){
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatest();
        assertEquals(24, result);

    }

    
    
}

// implementation of a stub class
// mocks make it easier to create dynamic stubs
class DataServiceStub implements DataService{
    @Override
    public int[] retrieveAllData() {
        return new int[] {24,6,15};
    }

}
