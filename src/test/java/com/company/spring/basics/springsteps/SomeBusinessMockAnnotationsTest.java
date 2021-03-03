package com.company.spring.basics.springsteps;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class) // include this when using Mockito annotations
public class SomeBusinessMockAnnotationsTest {
    //private DataService dataService;


    @Mock // This removes the line -> DataService dataServiceMock = mock(DataService.class);
    DataService dataServiceMock;

    @InjectMocks // This removes the line -> SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
    SomeBusinessImpl businessImpl;



    @Test
    public void testFindGreatest(){
        
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,6,15});
        int result = businessImpl.findTheGreatest();
        assertEquals(24, result);

    }

    @Test
    public void testFindOne(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {15});
        int result = businessImpl.findTheGreatest();
        assertEquals(15, result);
    }

    
    
}
