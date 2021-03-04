package com.company.spring.basics.springsteps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.spring.basics.springsteps.basic.BinarySearchImpl;
import com.company.spring.basics.springsteps.cdi.SomeCDIBusiness;
import com.company.spring.basics.springsteps.cdi.SomeCdiDAO;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(MockitoExtension.class)
@ContextConfiguration(classes=SpringStepsApplication.class) // this is where the context is present
public class SomeCdiBusinessTest {
    // Inject Mock into business object
    @InjectMocks
    SomeCDIBusiness business;

    // Create Mock
    @Mock
    SomeCdiDAO daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});

        int result = business.findGreatest();
        assertEquals(4, result);
    }

    @Test
    public void testBasicScenario2() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{ });

        int result = business.findGreatest();
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test
    public void testBasicScenario3() {
        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,2});

        int result = business.findGreatest();
        assertEquals(2, result);
    }
    
}
