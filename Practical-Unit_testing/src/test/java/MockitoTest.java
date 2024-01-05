import com.javad.Car;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MockitoTest {

    private final Car car = Mockito.mock(Car.class);

    @Test
    public void testWithoutUsingMockito() {
        assertFalse("The default boolean method should return false at the first without using Mockito",
                car.needFuel());
        assertEquals("The default double method should return 0.0",
                0.0, car.getEngineTemperature(), 1);
    }

    @Test
    public void testWithUsingMockito() {
        assertFalse("The default boolean method should return false at the first without using Mockito",
                car.needFuel());
        when(car.needFuel()).thenReturn(true);

        assertTrue("now the value of need fuel method is true",
                car.needFuel());
    }

    @Test(expected = RuntimeException.class)
    public void testMockitoWithException() {
        when(car.needFuel()).thenThrow(RuntimeException.class);

        car.needFuel();
    }

    @Test
    public void usingVerifyMockito() {

        car.needFuel();
        car.toDestination("Piroozi Street");

        verify(car).needFuel();
        verify(car).toDestination("Piroozi Street");

        //note : when you verify this will fail because you want this but not invoked
        verify(car).getEngineTemperature();
    }
}
