import com.javad.Car;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class MockitoTest {

    @Test
    public void testWithoutUsingMockito() {
        Car car = Mockito.mock(Car.class);
        assertFalse("The default boolean method should return false at the first without using Mockito",
                car.needFuel());
        assertEquals("The default double method should return 0.0",
                0.0,car.getEngineTemperature(), 1);
    }

    @Test
    public void testWithUsingMockito(){
        Car car = Mockito.mock(Car.class);
        assertFalse("The default boolean method should return false at the first without using Mockito",
                car.needFuel());
        when(car.needFuel()).thenReturn(true);

        assertTrue("now the value of need fuel method is true",
                car.needFuel());
    }
}
